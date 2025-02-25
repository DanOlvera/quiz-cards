package com.example.quizcards.feat_android_quiz.model.data

import com.google.gson.annotations.SerializedName

data class QuizResponse (

    @SerializedName("quiz" ) var quiz : ArrayList<Quiz> = arrayListOf()

)
