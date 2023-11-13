package com.example.springtest.service.impl

import com.example.springtest.dto.TestDto
import com.example.springtest.entity.Test
import com.example.springtest.repository.TestRepository
import com.example.springtest.service.TestService
import org.springframework.stereotype.Service
import java.time.LocalDateTime
import java.util.*

@Service
class TestServiceImpl(private val testRepository: TestRepository) : TestService {

    override fun save(testDto: TestDto): Test {
        val test = Test(
                name = testDto.name,
                birthDay = testDto.birthDay,
                id = (UUID.randomUUID().toString()),
                createdAt = (LocalDateTime.now()),
                phone = testDto.phone
        )
        return testRepository.save(test)
    }

    override fun getAll(): Iterable<Test> {
        return testRepository.findAll()
    }
}