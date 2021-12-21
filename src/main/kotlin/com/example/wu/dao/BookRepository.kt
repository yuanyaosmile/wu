package com.example.wu.dao

import com.example.wu.entity.Book
import org.springframework.data.mongodb.repository.MongoRepository

interface BookRepository: MongoRepository<Book, String> {

    fun findByName(name: String): Book
}