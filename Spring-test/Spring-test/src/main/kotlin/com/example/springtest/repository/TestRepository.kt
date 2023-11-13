package com.example.springtest.repository

import com.example.springtest.entity.Test
import org.springframework.data.jpa.repository.JpaRepository

interface TestRepository : JpaRepository<Test, String>