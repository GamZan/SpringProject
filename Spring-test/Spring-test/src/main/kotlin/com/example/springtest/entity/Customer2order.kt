package com.example.springtest.entity

import jakarta.persistence.*
import java.io.Serializable

@Entity
@Table(name = "customer2order")
@IdClass(value = Customer2OrderKey::class)
open class Customer2order(
        @Id
        @Column(name = "customer_id")
        open var customerId: Int,

        @Id
        @Column(name = "order_id")
        open var orderId: Int
)

class Customer2OrderKey(
        val customerId: Int,
        val orderId: Int
) : Serializable