package com.example.achievementspractice.data.api

import com.example.achievementspractice.data.models.WrappedAchievementsResponseModel
import retrofit2.http.GET

interface IProjectApi
{
    @GET("/achievements")
    suspend fun getAchievements () : WrappedAchievementsResponseModel
}