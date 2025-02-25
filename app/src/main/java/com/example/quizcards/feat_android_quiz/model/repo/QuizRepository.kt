package com.example.quizcards.feat_android_quiz.model.repo

import com.example.quizcards.feat_android_quiz.model.network.ApiQuizService
import com.example.quizcards.feat_android_quiz.state.QuizUiState
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class QuizRepository(private val apiQuizService: ApiQuizService) {

    fun getAndroidQuiz(): Flow<QuizUiState> = flow {
        try {
            emit(QuizUiState.Loading)
            val response = apiQuizService.getAndroidQuiz()
            emit(QuizUiState.Success(response))
        } catch (e: Exception) {
            emit(QuizUiState.Error(e.message ?: "An error occurred"))
        }
    }
}