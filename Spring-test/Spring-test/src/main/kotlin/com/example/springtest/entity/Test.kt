package com.example.springtest.entity

import jakarta.persistence.*
import java.time.LocalDate
import java.time.LocalDateTime

@Entity
@Table(name = "test")
class Test(
        @Id
        @Column(name = "id")
        var id: String,

        @Column(name = "name")
        var name: String,

        @Column(name = "birthDay")
        var birthDay: LocalDate,

        @Column(name = "createdAt")
        var createdAt: LocalDateTime,

        @Column(name = "phone")
        var phone: String
)