package com.example.myapplication.rest

import com.example.pssexample.models.Post

class Datasource {
    suspend fun loadNews(): List<Post> {
        return RetrofitHelper.getInstance().create(ApiService::class.java).getPosts()
    }
}

