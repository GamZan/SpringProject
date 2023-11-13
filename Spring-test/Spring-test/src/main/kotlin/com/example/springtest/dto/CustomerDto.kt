package com.example.springtest.dto

import java.io.Serializable


data class CustomerDto(
        val age: Int? = null,
        val firstname: String? = null,
        val order: List<OrderDto>
) : Serializable