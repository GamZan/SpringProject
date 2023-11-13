package com.example.springtest.dto

import java.io.Serializable


data class OrderDto(
        val quantity: Int? = null
) : Serializable