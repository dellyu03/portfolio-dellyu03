package com.seunghwan.portfolio.domain.repository

import com.seunghwan.portfolio.domain.entity.Achievement
import com.seunghwan.portfolio.domain.entity.Experience
import org.springframework.data.jpa.repository.JpaRepository

interface ExperienceRepository:JpaRepository<Experience, Long> {
 
}