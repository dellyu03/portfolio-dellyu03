package com.seunghwan.portfolio.domain.repository

import com.seunghwan.portfolio.domain.entity.Achievement
import com.seunghwan.portfolio.domain.entity.Link
import com.seunghwan.portfolio.domain.entity.Project
import org.springframework.data.jpa.repository.JpaRepository
import java.util.*

interface ProjectRepository:JpaRepository<Project, Long> {
    fun findAllByIsActive(isActive:Boolean): List<Project>

    override fun findById(id: Long): Optional<Project>
}