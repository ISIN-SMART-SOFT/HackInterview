package ru.isinsmartsoft.hackinterview.app.service

import org.springframework.stereotype.Service
import ru.isinsmartsoft.hackinterview.app.model.dto.InterviewDTO
import ru.isinsmartsoft.hackinterview.app.model.entity.Interview
import ru.isinsmartsoft.hackinterview.app.repository.InterviewRepository

@Service
class InterviewServiceImpl(
    private val interviewRepository: InterviewRepository
) : InterviewService {
    override fun getAll(): List<Interview> {
        return interviewRepository.findAll()
    }

    override fun createInterview(interview: InterviewDTO): Interview {
        return interviewRepository.save(
            Interview(
                title = interview.title,
                description = interview.description,
                dateMeet = interview.dateMeet
            )
        )
    }
}
