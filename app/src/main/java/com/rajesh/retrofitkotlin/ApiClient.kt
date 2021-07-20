package com.rajesh.retrofitkotlin

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ApiClient {

    var BASE_URL: String = "https://jsonplaceholder.typicode.com/"
    val getClient: ApiInterface
        get() {

            val retrofit = Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()

            return retrofit.create(ApiInterface::class.java)

        }
}