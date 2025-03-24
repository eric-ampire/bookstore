package com.ericampire.web.bookstore.domain.service

import com.ericampire.web.bookstore.domain.entity.AuthorEntity

interface AuthorService {
    fun saveAuthor(authorEntity: AuthorEntity): AuthorEntity
    fun findAll(): List<AuthorEntity>
}