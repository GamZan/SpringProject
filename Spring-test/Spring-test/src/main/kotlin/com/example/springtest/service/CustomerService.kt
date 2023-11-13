package com.example.springtest.service

import com.example.springtest.dto.CustomerDto
import com.example.springtest.entity.Customer
import java.util.*


interface CustomerService {

    fun save(customerDto: CustomerDto): Customer

    fun getAll(): Iterable<Customer>

    fun getById(id: Int): Optional<Customer>

    fun update(id: Int, customerDto: CustomerDto)

}