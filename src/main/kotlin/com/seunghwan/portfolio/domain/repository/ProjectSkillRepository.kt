package com.seunghwan.portfolio.domain.repository

import com.seunghwan.portfolio.domain.entity.Achievement
import com.seunghwan.portfolio.domain.entity.Project
import com.seunghwan.portfolio.domain.entity.ProjectSkill
import org.springframework.data.jpa.repository.JpaRepository
import java.util.Optional

interface ProjectSkillRepository : JpaRepository<ProjectSkill, Long> {

    // select * from project_skill where project_id = :projectId and skill_id = :skillId
    fun findByProjectIdAndSkillId(projectId: Long, skillId: Long): Optional<ProjectSkill>

}