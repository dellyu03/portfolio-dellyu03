package com.seunghwan.portfolio.presentation.dto

import com.seunghwan.portfolio.domain.entity.Skill

class SkillDTO(
    val name: String,
    val type: String
) {
    constructor(skill: Skill) : this(
        name = skill.name,
        type = skill.type.name
    )
}