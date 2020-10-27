package com.example.coroutinesinandroid.data.model

data class Quote(
    val author: String,
    val created_at: Any,
    val id: Int,
    val quote: String,
    val thumbnail: String,
    val updated_at: Any
)