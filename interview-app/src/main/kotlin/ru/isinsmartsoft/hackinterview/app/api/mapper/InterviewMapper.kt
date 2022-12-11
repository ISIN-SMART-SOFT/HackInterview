package ru.isinsmartsoft.hackinterview.app.api.mapper

import org.springframework.stereotype.Component
import ru.isinsmartsoft.hackinterview.app.api.dto.response.InterviewResponse
import ru.isinsmartsoft.hackinterview.app.model.entity.Interview

@Component
class InterviewMapper {

    fun toResponse(interview: Interview) = InterviewResponse(
        id = interview.id!!,
        title = interview.title,
        description = interview.description,
        dateMeet = interview.dateMeet
    )
}
