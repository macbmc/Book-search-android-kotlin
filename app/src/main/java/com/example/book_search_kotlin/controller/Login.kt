package com.example.book_search_kotlin.controller

class Login {
    fun loginAuth(username: String, password: String): Boolean {
        var key = false
        if (username.isNotEmpty() && password.isNotEmpty()) {
            key = true
        }
        return key
    }

}