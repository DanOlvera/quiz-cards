package com.example.quizcards.feat_android_quiz.model.network

import com.example.quizcards.feat_android_quiz.model.util.ApiUtils
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ApiQuizClient {
    private val logging = HttpLoggingInterceptor().apply {
        setLevel(HttpLoggingInterceptor.Level.BODY)
    }

    private val okhttp = OkHttpClient.Builder().apply {
        addInterceptor(logging)
    }

    internal val apiService: ApiQuizService by lazy {
        Retrofit.Builder()
            .baseUrl(ApiUtils.BASE_URL)
            .client(okhttp.build())
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(ApiQuizService::class.java)
    }
}