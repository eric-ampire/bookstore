package com.ericampire.web.bookstore.presentation.webcontroller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping

@Controller
class HtmlController {
    @GetMapping("/")
    fun blog(): String {
        return "Hello world"
    }
}