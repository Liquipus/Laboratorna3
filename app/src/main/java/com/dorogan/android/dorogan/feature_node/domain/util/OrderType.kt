package com.dorogan.android.dorogan.feature_node.domain.util

sealed class OrderType {
    object Ascending: OrderType()
    object Descending: OrderType()
}