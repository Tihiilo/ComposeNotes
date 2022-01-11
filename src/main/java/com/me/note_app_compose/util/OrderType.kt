package com.me.note_app_compose.util

sealed class OrderType {
    object Ascending: OrderType()
    object Descending: OrderType()
}