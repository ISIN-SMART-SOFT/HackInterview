package ru.isinsmartsoft.hackinterview.app.service

import ru.isinsmartsoft.hackinterview.app.model.dto.InterviewDTO
import ru.isinsmartsoft.hackinterview.app.model.entity.Interview

/**
 * @author Krylov Sergey
 * @date 11.12.2022 14:16
 */
interface InterviewService {

    fun getAll(): List<Interview>

    fun createInterview(interview: InterviewDTO): Interview
}
