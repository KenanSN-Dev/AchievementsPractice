package com.example.achievementspractice.data.di

import com.example.achievementspractice.data.api.IProjectApi
import com.example.achievementspractice.data.repository.Repository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepoModel {
    @Provides
    @Singleton
    fun provideRepository(iProjectApi: IProjectApi) : Repository
    {
        return Repository(iProjectApi)
    }
}