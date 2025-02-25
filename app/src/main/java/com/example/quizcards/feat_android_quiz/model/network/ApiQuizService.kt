package com.example.quizcards.feat_android_quiz.model.network

import com.example.quizcards.feat_android_quiz.model.data.Quiz
import retrofit2.http.GET

interface QuizService {

    @GET("quiz-data.json")
    suspend fun getAndroidQuiz(): Quiz
}