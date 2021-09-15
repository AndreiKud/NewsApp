package ru.andreikud.retrofitpracticing.data.network.dto

class NewsDto(
    val status: String? = null,
    val totalResults: Int? = null,
    val articles: List<ArticleDto>? = null,
)