package com.example.wu.service.impl

import com.example.wu.dao.BookRepository
import com.example.wu.entity.Book
import com.example.wu.service.BookService
import org.springframework.stereotype.Service

@Service
class BookServiceImpl(
    private val bookRepository: BookRepository
) : BookService {
    override fun findByName(name: String): Book {
        return bookRepository.findByName(name)
    }

}