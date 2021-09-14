package ru.andreikud.retrofitpracticing.data.network.dto

class User(
    val id: Int,
    val email: String,
    val name: String,
    val roles: List<Role>
)