package com.example.gm_challenge.remote

import com.example.gm_challenge.repo.GMService
import retrofit2.Retrofit
import javax.inject.Inject

class RetrofitInstance @Inject constructor(private val retrofit: Retrofit) {

    val gmService: GMService by lazy { retrofit.create(GMService::class.java) }

}