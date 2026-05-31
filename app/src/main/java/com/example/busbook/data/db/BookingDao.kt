package com.example.busbook.data.db

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface BookingDao {
    @Insert
    suspend fun insert(booking: BookingEntity): Long

    @Query("SELECT * FROM bookings ORDER BY bookedAt DESC")
    fun observeAll(): LiveData<List<BookingEntity>>

    @Query("DELETE FROM bookings")
    suspend fun clear()
}
