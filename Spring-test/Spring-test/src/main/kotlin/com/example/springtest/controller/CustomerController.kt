package com.example.springtest.controller

import com.example.springtest.dto.CustomerDto
import com.example.springtest.entity.Customer
import com.example.springtest.entity.Order
import com.example.springtest.repository.OrderRepository
import com.example.springtest.service.CustomerService
import org.springframework.web.bind.annotation.*
import java.util.*
import kotlin.collections.List

@RestController
@RequestMapping("/v3/customer")
class CustomerController(
        private val customerService: CustomerService, private val orderRepository: OrderRepository
) {



    @PostMapping
    fun save(@RequestBody customer: CustomerDto): Customer {
        return customerService.save(customer)
    }

    @GetMapping
    fun getAll(): Iterable<Customer> {
        return customerService.getAll()
    }

    @PutMapping("/{id}")
    fun update(@PathVariable id: Int, @RequestBody customer: CustomerDto) {
        customerService.update(id, customer)
    }

    @GetMapping("/{id}")
    fun getById(@PathVariable id: Int): Optional<Customer> {
        return customerService.getById(id)
    }

    @GetMapping("/{id}/orders")
    fun getOrdersByCustomerId(@PathVariable id: Int): List<Order> {
        return orderRepository.getOrdersByCustomer(id)
    }
}