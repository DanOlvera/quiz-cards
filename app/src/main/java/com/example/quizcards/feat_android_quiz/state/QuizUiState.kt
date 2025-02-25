package com.example.quizcards.feat_android_quiz.state

import com.example.quizcards.feat_android_quiz.model.data.Quiz

sealed class QuizUiState {
    data object Loading: QuizUiState()
    data class Success(val quiz: Quiz): QuizUiState()
    data class Error(val message: String): QuizUiState()
}