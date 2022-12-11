package ru.isinsmartsoft.hackinterview.app.model.dto

import java.time.Instant

data class InterviewDTO(
    val title: String,
    val description: String,
    val dateMeet: Instant,
)
