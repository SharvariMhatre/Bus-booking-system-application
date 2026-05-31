package com.example.busbook.data.db

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "profiles")
data class ProfileEntity(
    @PrimaryKey val uid: String,
    val firstName: String,
    val email: String,
    val phone: String,
    val photoUri: String? = null
)
