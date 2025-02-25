package com.example.quizcards.feat_android_quiz.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.quizcards.feat_android_quiz.model.repo.QuizRepository

@Suppress("UNCHECKED_CAST")
class ViewModelFactory(private val repo: QuizRepository) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(QuizViewModel::class.java)) {
            return QuizViewModel(repo) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}