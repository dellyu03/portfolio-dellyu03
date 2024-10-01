package com.seunghwan.portfolio.domain.repository

import com.seunghwan.portfolio.domain.entity.Achievement
import org.springframework.data.jpa.repository.JpaRepository

interface ProjectRepository:JpaRepository<Achievement, Long> {

}