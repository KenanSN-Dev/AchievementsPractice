package com.example.achievementspractice.data.models


import com.google.gson.annotations.SerializedName

data class WrappedAchievementsResponseModel(
    @SerializedName("data")
    val `data`: List<AchievementsResponseModel?>?
)