package com.example.coroutinesinandroid.data.model

data class QuotesResponse(
    val isSuccessful: Boolean,
    val quotes: List<Quote>
)