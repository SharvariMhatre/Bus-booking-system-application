package com.example.busbook.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.example.busbook.data.db.AppDatabase
import com.example.busbook.data.db.BookingEntity
import com.example.busbook.model.BusInfo
import com.example.busbook.model.SearchQuery
import com.example.busbook.model.Ticket
import kotlinx.coroutines.launch

/**
 * Activity-scoped ViewModel that holds the in-flight booking flow.
 * Fragments read/write the same instance via `activityViewModels()`, so we no
 * longer have to pipe 8-13 string extras through every screen transition.
 */
class BookingViewModel(application: Application) : AndroidViewModel(application) {

    private val db = AppDatabase.get(application)
    private val bookingDao = db.bookingDao()

    private val _query = MutableLiveData<SearchQuery?>()
    val query: LiveData<SearchQuery?> = _query

    private val _selectedBus = MutableLiveData<BusInfo?>()
    val selectedBus: LiveData<BusInfo?> = _selectedBus

    private val _pendingTicket = MutableLiveData<Ticket?>()
    val pendingTicket: LiveData<Ticket?> = _pendingTicket

    val allBookings: LiveData<List<BookingEntity>> = bookingDao.observeAll()

    fun setQuery(query: SearchQuery) {
        _query.value = query
    }

    fun selectBus(bus: BusInfo) {
        _selectedBus.value = bus
    }

    fun stageSeat(seatNumber: Int) {
        val q = _query.value ?: return
        val b = _selectedBus.value ?: return
        _pendingTicket.value = Ticket(q, b, seatNumber)
    }

    fun confirmTicket() {
        val ticket = _pendingTicket.value ?: return
        viewModelScope.launch {
            bookingDao.insert(
                BookingEntity(
                    fromCity = ticket.query.from,
                    toCity = ticket.query.to,
                    date = ticket.query.date,
                    operator = ticket.bus.operator,
                    busType = ticket.bus.busType,
                    departure = ticket.bus.departure,
                    arrival = ticket.bus.arrival,
                    price = ticket.bus.price,
                    seatNumber = ticket.seatNumber
                )
            )
        }
    }

    fun resetFlow() {
        _selectedBus.value = null
        _pendingTicket.value = null
    }
}
