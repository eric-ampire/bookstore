package com.ericampire.web.bookstore.domain.entity

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Table

@Entity
@Table(name = "authors")
data class AuthorEntity(
    @Id
    @Column(name = "isbn")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "author_id_seq")
    val id: Long?,
    val name: String,
    val age: Int,
    val description: String
)
