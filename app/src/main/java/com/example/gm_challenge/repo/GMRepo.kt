package com.example.gm_challenge.repo

import com.example.gm_challenge.model.GMResponse
import com.example.gm_challenge.remote.RetrofitInstance
import javax.inject.Inject

class GMRepo @Inject constructor( private val retrofit: RetrofitInstance) {

    suspend fun createGMResponse(artistName: String): GMResponse {
        return retrofit.gmService.getGMService(artistName)
    }

}