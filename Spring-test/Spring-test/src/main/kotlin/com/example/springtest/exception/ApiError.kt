package com.example.springtest.exception

data class ApiError(
        val errorCode: String,
        val description: String,
)