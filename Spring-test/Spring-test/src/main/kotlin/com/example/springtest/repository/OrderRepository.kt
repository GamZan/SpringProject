package com.example.springtest.repository

import com.example.springtest.entity.Order
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.query.Param

interface OrderRepository : JpaRepository<Order, Int> {
    @Query("""select *
            from orders
            join public.customer2order c2o on orders.id = c2o.order_id
            where  c2o.customer_id = :customerId""", nativeQuery = true)
    fun getOrdersByCustomer(@Param("customerId") customerId: Int) : List<Order>
}