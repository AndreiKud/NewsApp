package ru.andreikud.retrofitpracticing.data.network

import retrofit2.http.GET
import retrofit2.http.Query
import ru.andreikud.retrofitpracticing.data.network.dto.NewsDto

interface NewsApi {
    companion object {
        const val BASE_URL = "https://newsapi.org"
        const val ENDPOINT_EVERYTHING = "/v2/everything"
    }

    @GET(value = ENDPOINT_EVERYTHING)
    suspend fun getEverything(@Query("q") searchQuery: String): NewsDto

}