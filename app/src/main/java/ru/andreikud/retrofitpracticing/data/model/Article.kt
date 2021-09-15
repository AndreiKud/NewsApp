package ru.andreikud.retrofitpracticing.data.model

import ru.andreikud.retrofitpracticing.data.network.dto.SourceDto

class Article(
    val source: Source?,
    val author: String?,
    val title: String?,
    val description: String?,
    val url: String?,
    val urlToImage: String?,
    val publishedAt: String?,
    val content: String?
)