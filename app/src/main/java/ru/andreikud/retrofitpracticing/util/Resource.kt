package ru.andreikud.retrofitpracticing.util

sealed class Resource(val status: Status) {
    enum class Status {
        LOADING,
        SUCCESS,
        ERROR
    }

    class Success(val data: Any?) : Resource(Status.SUCCESS)
    class Loading() : Resource(Status.LOADING)
    class Error(val msg: String) : Resource(Status.ERROR)
}