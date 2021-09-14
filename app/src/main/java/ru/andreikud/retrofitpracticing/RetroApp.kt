package ru.andreikud.retrofitpracticing

import android.app.Application
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava3.RxJava3CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import ru.andreikud.retrofitpracticing.data.network.SandboxApi

class RetroApp : Application() {

    lateinit var sandboxApi: SandboxApi

    override fun onCreate() {
        super.onCreate()
        setupApi()
    }

    private fun setupApi() {
        val loggingInterceptor = HttpLoggingInterceptor().apply {
            level = HttpLoggingInterceptor.Level.BODY
        }

        val okHttpClient = OkHttpClient.Builder()
            .addInterceptor(loggingInterceptor)
            .build()

        val retrofit = Retrofit.Builder()
            .baseUrl("https://mysimpleapi.getsandbox.com:443")
            .client(okHttpClient)
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(RxJava3CallAdapterFactory.create())
            .build()

        sandboxApi = retrofit.create(SandboxApi::class.java)
    }

}