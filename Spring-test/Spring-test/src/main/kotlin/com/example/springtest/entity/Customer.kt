package com.example.springtest.entity

import jakarta.persistence.*

@Entity
@Table(name = "customers")
open class Customer(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id", nullable = false)
        open var id: Int? = null,

        @Column(name = "age")
        open var age: Int? = null,

        @Column(name = "firstname", nullable = false, length = 20)
        open var firstname: String? = null,

        @OneToMany
        @JoinTable(
                name = "customer2order",
                joinColumns = [JoinColumn(name = "customer_id")],
                inverseJoinColumns = [JoinColumn(name = "order_id")]
        )
        open var orders: MutableList<Order> = mutableListOf()
)