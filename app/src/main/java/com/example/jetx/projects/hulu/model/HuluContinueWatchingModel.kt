package com.example.jetx.projects.hulu.model

import androidx.annotation.DrawableRes

data class HuluContinueWatchingModel(
    @DrawableRes val image: Int,
    val title:String,
    val alreadyWatchedProgress:Float,
    val timeLeft:String
)
