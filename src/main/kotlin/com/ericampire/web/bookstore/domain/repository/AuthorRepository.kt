package com.ericampire.web.bookstore.domain.repository

import com.ericampire.web.bookstore.domain.entity.AuthorEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface AuthorRepository : JpaRepository<AuthorEntity, Long>