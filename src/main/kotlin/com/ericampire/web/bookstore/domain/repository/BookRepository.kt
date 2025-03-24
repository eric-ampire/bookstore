package com.ericampire.web.bookstore.domain.repository

import com.ericampire.web.bookstore.domain.entity.BookEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface BookRepository : JpaRepository<BookEntity, Long>