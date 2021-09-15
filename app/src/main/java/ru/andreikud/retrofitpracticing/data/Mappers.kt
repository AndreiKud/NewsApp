package ru.andreikud.retrofitpracticing.data

import ru.andreikud.retrofitpracticing.data.model.Article
import ru.andreikud.retrofitpracticing.data.model.News
import ru.andreikud.retrofitpracticing.data.model.Source
import ru.andreikud.retrofitpracticing.data.network.dto.ArticleDto
import ru.andreikud.retrofitpracticing.data.network.dto.NewsDto
import ru.andreikud.retrofitpracticing.data.network.dto.SourceDto

fun NewsDto.toDomain(): News = News(
    status = status,
    totalResults = totalResults,
    articles = articles?.map { it.toDomain() }
)

fun ArticleDto.toDomain(): Article = Article(
    source = sourceDto?.toDomain(),
    author = author,
    title = title,
    description = description,
    url = url,
    urlToImage = urlToImage,
    publishedAt = publishedAt,
    content = content
)

fun SourceDto.toDomain(): Source = Source(
    id = id,
    name = name
)