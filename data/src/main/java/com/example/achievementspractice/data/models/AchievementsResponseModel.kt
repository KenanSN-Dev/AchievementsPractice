package com.example.achievementspractice.data.models


import com.google.gson.annotations.SerializedName

data class AchievementsResponseModel(
    @SerializedName("id")
    val id: Int?,
    @SerializedName("label")
    val label: String?,
    @SerializedName("records")
    val records: List<RecordModel?>?,
    @SerializedName("title")
    val title: String?
)