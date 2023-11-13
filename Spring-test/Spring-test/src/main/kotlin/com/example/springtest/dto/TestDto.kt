package com.example.springtest.dto

import java.time.LocalDate


data class TestDto(
        var name: String,
        var birthDay: LocalDate,
        var phone: String
)
