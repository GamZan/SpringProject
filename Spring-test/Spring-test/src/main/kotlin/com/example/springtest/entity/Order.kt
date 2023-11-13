package com.example.springtest.entity

import jakarta.persistence.*

@Entity
@Table(name = "orders")
open class Order(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id", nullable = false)
        open var id: Int? = null,

        @Column(name = "quantity")
        open var quantity: Int? = null,
)