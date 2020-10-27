package com.example.coroutinesinandroid.data.network

import com.example.coroutinesinandroid.data.model.QuotesResponse
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

interface MyApi {

    @GET("quotes")
    suspend fun getMovies(): Response<QuotesResponse>

    companion object {
        operator fun invoke(): MyApi {
            return Retrofit.Builder().addConverterFactory(GsonConverterFactory.create())
                .baseUrl("http://api.simplifiedcoding.in/course-apis/mvvm/").build()
                .create(MyApi::class.java)
        }
    }
}