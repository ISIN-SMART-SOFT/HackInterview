package ru.isinsmartsoft.hackinterview.app.api

import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.tags.Tag
import mu.KotlinLogging
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import ru.isinsmartsoft.hackinterview.app.api.dto.request.CreateInterviewRequest
import ru.isinsmartsoft.hackinterview.app.api.dto.response.InterviewResponse
import ru.isinsmartsoft.hackinterview.app.api.mapper.InterviewMapper
import ru.isinsmartsoft.hackinterview.app.model.dto.InterviewDTO
import ru.isinsmartsoft.hackinterview.app.service.InterviewService

private val log = KotlinLogging.logger { }

@RestController
@RequestMapping("/interview")
@Tag(name = "Операции с интервью")
class InterviewEndpoint(
    private val interviewService: InterviewService,
    private val interviewMapper: InterviewMapper
) {
    @GetMapping
    @Operation(summary = "Получение всех интервью")
    suspend fun getAll(): List<InterviewResponse> {
        log.info { "Get all interview" }
        return interviewService.getAll().map {
            interviewMapper.toResponse(it)
        }.also {
            log.info { "Get all interview success!!!" }
        }
    }

    @PostMapping
    @Operation(summary = "Создание интервью")
    suspend fun createInterview(
        @RequestBody request: CreateInterviewRequest
    ): InterviewResponse {
        log.info { "Create interview: $request" }
        val interview = interviewService.createInterview(
            InterviewDTO(
                title = request.title,
                description = request.description,
                dateMeet = request.dateMeet
            )
        )
        return interviewMapper.toResponse(interview).also {
            log.info { "Interview success create!!!" }
        }
    }
}
