package com.example.quizcards.feat_android_quiz.intent

sealed class QuizIntent {
    data object FetchQuizData: QuizIntent()
}