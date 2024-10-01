package com.seunghwan.portfolio.domain.repository

import com.seunghwan.portfolio.domain.entity.Achievement
import com.seunghwan.portfolio.domain.entity.HttpInterface
import org.springframework.data.jpa.repository.JpaRepository

interface HttpInterfaceepository:JpaRepository<HttpInterface, Long> {

}