package com.androidcorpo.coroutines.data.models

data class QuotesResponse(
    val isSuccessful: Boolean,
    val quotes: List<Quote>
)