package com.ericampire.web.bookstore.domain.service.impl

import com.ericampire.web.bookstore.domain.entity.AuthorEntity
import com.ericampire.web.bookstore.domain.repository.AuthorRepository
import com.ericampire.web.bookstore.domain.service.AuthorService
import org.springframework.stereotype.Service

@Service
class AuthorServiceImpl(
    private val authorRepository: AuthorRepository
) : AuthorService {
    override fun saveAuthor(authorEntity: AuthorEntity): AuthorEntity {
        return authorRepository.save(authorEntity)
    }

    override fun findAll(): List<AuthorEntity> {
        return authorRepository.findAll()
    }
}