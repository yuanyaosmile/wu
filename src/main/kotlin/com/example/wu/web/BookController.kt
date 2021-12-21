package com.example.wu.web

import com.example.wu.entity.Book
import com.example.wu.service.BookService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import javax.websocket.server.PathParam

@RestController
class BookController(
    private val bookService: BookService) {

    @GetMapping("/book")
    fun getBookByName(name: String): ResponseEntity<Book> {
        var book = bookService.findByName(name)
        return ResponseEntity.ok(book)
    }


}