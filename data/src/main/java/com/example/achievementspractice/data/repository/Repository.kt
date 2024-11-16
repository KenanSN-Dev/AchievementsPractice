package com.example.achievementspractice.data.repository

import com.example.achievementspractice.data.api.IProjectApi
import com.example.achievementspractice.data.models.AchievementsResponseModel
import com.example.achievementspractice.data.models.WrappedAchievementsResponseModel
import javax.inject.Inject

class Repository @Inject constructor(private val iProjectApi: IProjectApi){
     suspend fun getAchievements(): List<AchievementsResponseModel?>?{
        return iProjectApi.getAchievements().data
    }
}