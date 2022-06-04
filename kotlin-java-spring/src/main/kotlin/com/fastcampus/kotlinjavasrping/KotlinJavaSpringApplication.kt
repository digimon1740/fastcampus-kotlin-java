package com.fastcampus.kotlinjavasrping

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.transaction.annotation.Transactional
import javax.persistence.*

@SpringBootApplication
class KotlinJavaSpringApplication


fun main(args: Array<String>) {
    runApplication<KotlinJavaSpringApplication>()
}

@Transactional
class Service

@Entity
@Table
class Person(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long?,

    @Column
    var name: String?,

    @Column
    var age: Int?,
)