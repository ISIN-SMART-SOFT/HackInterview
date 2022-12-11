package ru.isinsmartsoft.hackinterview.app.api.dto.response

import java.time.Instant

data class InterviewResponse(
    val id: Long,
    val title: String,
    val description: String,
    val dateMeet: Instant,
)
