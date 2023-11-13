package com.example.springtest.controller

import com.example.springtest.dto.TestDto
import com.example.springtest.entity.Test
import com.example.springtest.service.TestService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/v1/example")
class TestController(
        private val testService: TestService
) {

    @PostMapping
    fun save(@RequestBody test: TestDto): Test {
        return testService.save(test)
    }

    @GetMapping
    fun getAll(): Iterable<Test> {
        return testService.getAll()
    }
}