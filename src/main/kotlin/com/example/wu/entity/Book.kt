package com.example.wu.entity

import lombok.Data
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Data
@Document("books")
data class Book(
    @Id
    val id: String,
    val name:String,
    val edition: Int
)

