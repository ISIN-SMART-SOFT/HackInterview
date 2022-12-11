package ru.isinsmartsoft.hackinterview.app.api.dto.request

import java.time.Instant

data class CreateInterviewRequest(
    val title: String,
    val description: String,
    val dateMeet: Instant,
)
