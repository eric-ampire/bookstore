package com.ericampire.web.bookstore.presentation.restcontroller

import com.ericampire.web.bookstore.domain.entity.AuthorEntity
import com.ericampire.web.bookstore.domain.service.AuthorService
import com.ericampire.web.bookstore.presentation.dto.AuthorDto
import com.ericampire.web.bookstore.presentation.mapper.toAuthorDto
import com.ericampire.web.bookstore.presentation.mapper.toAuthorEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class AuthorController(private val authorService: AuthorService) {

    @PostMapping(path = ["/v1/authors"])
    fun createAuthor(@RequestBody author: AuthorDto): AuthorDto {
        return authorService.saveAuthor(author.toAuthorEntity()).toAuthorDto()
    }

    @GetMapping(path = ["/v1/authors"])
    fun getAuthors(): List<AuthorDto> {
        return authorService.findAll().map(AuthorEntity::toAuthorDto)
    }
}
