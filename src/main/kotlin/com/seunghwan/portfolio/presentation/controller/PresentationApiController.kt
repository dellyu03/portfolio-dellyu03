package com.seunghwan.portfolio.presentation.controller

import com.seunghwan.portfolio.domain.entity.ProjectDetail
import com.seunghwan.portfolio.presentation.dto.IntroductionDTO
import com.seunghwan.portfolio.presentation.dto.ProjectDTO
import com.seunghwan.portfolio.presentation.dto.ResumeDTO
import com.seunghwan.portfolio.presentation.service.PresentationService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api")
class PresentationApiController (
    private val presentationService : PresentationService
) {

    @GetMapping("/test")
    fun test(): String {
        return "Ok"
    }

    @GetMapping("/v1/introductions")
    fun getLink(): List<IntroductionDTO> {
        return presentationService.getIntroductions()
    }

    @GetMapping("/v1/links")
    fun getResume(): ResumeDTO {
        return presentationService.getResume()
    }

    @GetMapping("/v1/projects")
    fun getIntroductions(): List<ProjectDTO> {
        return presentationService.getProjects()
    }
}