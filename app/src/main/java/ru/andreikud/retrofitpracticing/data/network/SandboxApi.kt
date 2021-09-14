package ru.andreikud.retrofitpracticing.data.network

import io.reactivex.rxjava3.core.Single
import retrofit2.http.GET
import retrofit2.http.Headers
import ru.andreikud.retrofitpracticing.data.network.dto.Response

interface SandboxApi {

    @GET("/users")
    @Headers("Content-Type: application/json")
    fun getUsers(): Single<Response>

}