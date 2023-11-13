package com.example.springtest.service.impl

import com.example.springtest.dto.CustomerDto
import com.example.springtest.dto.OrderDto
import com.example.springtest.entity.Customer
import com.example.springtest.entity.Order
import com.example.springtest.exception.CustomerNotFoundException
import com.example.springtest.repository.CustomerRepository
import com.example.springtest.repository.OrderRepository
import com.example.springtest.service.CustomerService
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional
import java.util.*

@Service
class CustomerServiceImpl(
        private val customerRepository: CustomerRepository,
        private val orderRepository: OrderRepository
) : CustomerService {


    @Transactional
    override fun save(customerDto: CustomerDto): Customer {
        val test = customerRepository.save(customerDto.toEntity())
        val orders = orderRepository.saveAll(customerDto.order.map { it.toEntity() })
        test.orders = orders
        return customerRepository.save(test)
    }

    override fun getAll(): Iterable<Customer> {
        return customerRepository.findAll()
    }


    override fun getById(id: Int): Optional<Customer> {
        return customerRepository.findById(id)
    }

    @Transactional
    override fun update(id: Int, customerDto: CustomerDto) {
        var existingCustomer = customerRepository.findByIdOrNull(id)
                ?: throw CustomerNotFoundException(id)
        existingCustomer.firstname = customerDto.firstname
        existingCustomer.age = customerDto.age
        existingCustomer = customerRepository.save(existingCustomer)
        customerRepository.save(existingCustomer)
    }

    private fun CustomerDto.toEntity(): Customer = Customer(
            age = this.age,
            firstname = this.firstname,
    )

    private fun OrderDto.toEntity(): Order =
            Order(
                    quantity = this.quantity
            )
}