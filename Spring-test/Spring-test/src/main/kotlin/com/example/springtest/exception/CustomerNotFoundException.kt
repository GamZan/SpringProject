package com.example.springtest.exception

import org.springframework.http.HttpStatus

class CustomerNotFoundException(customerId: Int) : BaseException(
        HttpStatus.NOT_FOUND,
        ApiError(
                errorCode = "customer not found",
                description = "Customer not fount with id=$customerId"
        )
)