package com.example.wu.entity

import lombok.Data
import lombok.Generated
import lombok.Getter
import lombok.Setter
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Getter
@Setter
@Document("books")
data class Book(
    @Id
    @Generated
    val id: String? = null,
    val name:String,
    val edition: Int
)

