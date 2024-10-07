package com.seunghwan.portfolio.domain.repository

import com.seunghwan.portfolio.domain.entity.Achievement
import com.seunghwan.portfolio.domain.entity.Introduction
import com.seunghwan.portfolio.domain.entity.Link
import org.springframework.data.jpa.repository.JpaRepository

interface LinkRepository:JpaRepository<Link, Long> {
    fun findAllByIsActive(isActive:Boolean): List<Link>
}