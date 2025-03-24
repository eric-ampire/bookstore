package com.ericampire.web.bookstore.presentation.dto

import com.ericampire.web.bookstore.domain.entity.AuthorEntity

data class BookDto(
    val isbn: String,
    val title: String,
    val description: String,
    val image: String,
    val authorEntity: AuthorEntity
)
