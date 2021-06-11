package com.example.gm_challenge.repo

import com.example.gm_challenge.model.GMResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface GMService  {

    @GET("search")

    suspend fun getGMService(@Query("term") artistName : String): GMResponse
}