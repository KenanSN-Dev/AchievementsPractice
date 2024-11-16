package com.example.achievementspractice.data.models


import com.google.gson.annotations.SerializedName

data class RecordModel(
    @SerializedName("active")
    val active: Boolean?,
    @SerializedName("id")
    val id: Int?,
    @SerializedName("image")
    val image: String?,
    @SerializedName("label")
    val label: String?,
    @SerializedName("title")
    val title: String?
)