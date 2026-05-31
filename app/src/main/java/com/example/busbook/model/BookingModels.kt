package com.example.busbook.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

/**
 * Typed models that replace the old `putExtra("message_4", ...)` string-bag pattern.
 * All implement Parcelable via kotlin-parcelize so they can be passed through SavedStateHandle
 * or stored in a shared ViewModel.
 */

@Parcelize
data class SearchQuery(
    val from: String,
    val to: String,
    val date: String
) : Parcelable

@Parcelize
data class BusInfo(
    val operator: String,
    val busType: String,
    val departure: String,
    val arrival: String,
    val price: String
) : Parcelable

@Parcelize
data class Ticket(
    val query: SearchQuery,
    val bus: BusInfo,
    val seatNumber: Int
) : Parcelable
