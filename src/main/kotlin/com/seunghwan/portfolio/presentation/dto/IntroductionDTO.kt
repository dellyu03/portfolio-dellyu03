package com.seunghwan.portfolio.presentation.dto

import com.seunghwan.portfolio.domain.entity.Introduction

data class IntroductionDTO (
    val content: String,
) {
    constructor(introduction: Introduction) : this(
        content = introduction.content
    )
}


