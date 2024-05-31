package com.asr.bookstore


data class Categories(
    val id: Int,
    val title: String,
    val author: String,
)

data class CategoriesResponse(val categories: List<Categories>)