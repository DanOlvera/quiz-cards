package com.example.quizcards.feat_android_quiz.model.data

import com.google.gson.annotations.SerializedName

data class Quiz (

    @SerializedName("id"             ) var id            : Int?     = null,
    @SerializedName("type"           ) var type          : String?  = null,
    @SerializedName("question"       ) var question      : String?  = null,
    @SerializedName("correct_answer" ) var correctAnswer : Boolean? = null

)
