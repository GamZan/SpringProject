package com.example.springtest.service

import com.example.springtest.dto.TestDto
import com.example.springtest.entity.Test
import org.springframework.stereotype.Service

@Service
interface TestService {

    fun save(testDto: TestDto): Test

    fun getAll(): Iterable<Test>
}