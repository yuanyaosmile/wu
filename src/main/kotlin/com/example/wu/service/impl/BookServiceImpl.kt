package com.example.wu.service.impl

import com.example.wu.dao.BookRepository
import com.example.wu.entity.Book
import com.example.wu.service.BookService
import org.springframework.stereotype.Service
import java.util.concurrent.ArrayBlockingQueue
import java.util.concurrent.BlockingDeque
import java.util.concurrent.ThreadPoolExecutor
import java.util.concurrent.TimeUnit

@Service
class BookServiceImpl(
    private val bookRepository: BookRepository
) : BookService {
    val pool = ThreadPoolExecutor(5, 10, 30, TimeUnit.SECONDS, ArrayBlockingQueue(100))

    override fun findByName(name: String): Book {
        return bookRepository.findByName(name)
    }

    override fun saveBook(book: Book) {
        bookRepository.save(book)
    }


}