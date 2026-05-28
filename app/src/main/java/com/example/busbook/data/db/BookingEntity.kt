package com.example.busbook.data.db

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "bookings")
data class BookingEntity(
    @PrimaryKey(autoGenerate = true) val id: Long = 0,
    val fromCity: String,
    val toCity: String,
    val date: String,
    val operator: String,
    val busType: String,
    val departure: String,
    val arrival: String,
    val price: String,
    val seatNumber: Int,
    val bookedAt: Long = System.currentTimeMillis()
)
