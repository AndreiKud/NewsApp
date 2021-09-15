package ru.andreikud.retrofitpracticing.data.model

import ru.andreikud.retrofitpracticing.data.network.dto.ArticleDto

class News(
    val status: String?,
    val totalResults: Int?,
    val articles: List<Article>?,
)