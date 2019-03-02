package com.example.around2.remote

import java.net.URL

class NetworkManager {
    fun get(url: String) : String {
        return URL(url)
            .openStream()
            .bufferedReader()
            .use {
                it.readText()
            }
    }
}