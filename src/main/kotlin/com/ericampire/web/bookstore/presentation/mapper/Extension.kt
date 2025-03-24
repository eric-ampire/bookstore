package com.ericampire.web.bookstore.presentation.mapper

import com.ericampire.web.bookstore.domain.entity.AuthorEntity
import com.ericampire.web.bookstore.domain.entity.BookEntity
import com.ericampire.web.bookstore.presentation.dto.AuthorDto
import com.ericampire.web.bookstore.presentation.dto.BookDto

fun AuthorEntity.toAuthorDto() = AuthorDto(
    id = id,
    name = name,
    age = age,
    description = description
)

fun AuthorDto.toAuthorEntity() = AuthorEntity(
    id = id,
    name = name,
    age = age,
    description = description
)

fun BookDto.toBookEntity() = BookEntity(
    isbn = isbn,
    title = title,
    description = description,
    image = image,
    authorEntity = authorEntity
)

fun BookEntity.toBookDto() = BookDto(
    isbn = isbn,
    title = title,
    description = description,
    image = image,
    authorEntity = authorEntity
)

