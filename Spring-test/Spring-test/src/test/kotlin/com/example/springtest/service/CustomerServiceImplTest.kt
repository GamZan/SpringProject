package com.example.springtest.service

import com.example.springtest.repository.OrderRepository
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class CustomerServiceImplTest {

    @Autowired
    lateinit var orderRepository: OrderRepository

    @Test
    fun save() {

    }

    @Test
    fun getAll() {
    }

    @Test
    fun getById() {
        val result = orderRepository.getOrdersByCustomer(11)
        assertEquals(2, result.size)
    }

    @Test
    fun update() {
    }
}