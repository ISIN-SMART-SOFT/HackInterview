package ru.isinsmartsoft.hackinterview.app.model.entity

import java.time.Instant
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.Table

/**
 * @author Krylov Sergey
 * @date 11.12.2022 13:57
 */
@Entity
@Table(name = TableName.INTERVIEW)
class Interview(
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null,

    @Column(name = "title", nullable = false)
    var title: String,

    @Column(name = "description", nullable = false)
    var description: String,

    @Column(name = "date_meet", nullable = false)
    var dateMeet: Instant
)
