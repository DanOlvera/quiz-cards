package com.example.quizcards.feat_android_quiz.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.quizcards.feat_android_quiz.intent.QuizIntent
import com.example.quizcards.feat_android_quiz.model.repo.QuizRepository
import com.example.quizcards.feat_android_quiz.state.QuizUiState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class QuizViewModel(private val repository: QuizRepository): ViewModel() {

    private val _quizState = MutableStateFlow<QuizUiState>(QuizUiState.Loading)
    val quizState: StateFlow<QuizUiState> = _quizState

    fun handleIntent(intent: QuizIntent) {
        when(intent) {
            is QuizIntent.FetchQuizData -> {
                fetchAndroidQuizData()
            }
        }
    }

    fun fetchAndroidQuizData() {
        viewModelScope.launch {
            repository.getAndroidQuiz().collect { state ->
                try {
                    _quizState.value = state
                } catch (e: Exception) {
                    QuizUiState.Error(e.message ?: "Something went wrong. Unknown error")
                }
            }
        }
    }
}