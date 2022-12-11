package ru.isinsmartsoft.hackinterview.app.repository

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.JpaSpecificationExecutor
import org.springframework.stereotype.Repository
import ru.isinsmartsoft.hackinterview.app.model.entity.Interview

@Repository
interface InterviewRepository : JpaRepository<Interview, Long>, JpaSpecificationExecutor<Interview>
