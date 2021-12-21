package com.example.wu.service

import com.example.wu.entity.Book

interface BookService {
    fun findByName(bookName: String) : Book
}