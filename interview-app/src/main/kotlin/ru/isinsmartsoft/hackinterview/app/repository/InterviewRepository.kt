package ru.isinsmartsoft.hackinterview.app.repository;

interface InterviewRepository: org.springframework.data.jpa.repository.JpaRepository<ru.isinsmartsoft.hackinterview.app.model.entity.Interview, kotlin.Long> ,org.springframework.data.jpa.repository.JpaSpecificationExecutor<ru.isinsmartsoft.hackinterview.app.model.entity.Interview> {
}