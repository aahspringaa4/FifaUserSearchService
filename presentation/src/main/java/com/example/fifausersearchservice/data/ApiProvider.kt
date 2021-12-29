package com.example.fifausersearchservice.data

import BASE_URL
import com.example.fifausersearchservice.data.main.MainApi
import retrofit2.Retrofit
import retrofit2.adapter.rxjava3.RxJava3CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

private val retrofit: Retrofit = Retrofit.Builder().apply {
    baseUrl(BASE_URL)
    addCallAdapterFactory(RxJava3CallAdapterFactory.create())
    addConverterFactory(GsonConverterFactory.create())
}.build()

val mainApi : MainApi by lazy {
    retrofit.create(MainApi::class.java)
}