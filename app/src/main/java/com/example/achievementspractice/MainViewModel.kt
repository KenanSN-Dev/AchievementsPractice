package com.example.achievementspractice

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.achievementspractice.data.models.AchievementsResponseModel
import com.example.achievementspractice.data.repository.Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(private val repository: Repository): ViewModel() {

    private val _AchievementsSuccessfullResponse : MutableLiveData<List<AchievementsResponseModel?>?> = MutableLiveData()
    val achievementsSuccessfulResponse : LiveData<List<AchievementsResponseModel?>?> = _AchievementsSuccessfullResponse
    private val _AchievementsErrorResponse : MutableLiveData<Exception> = MutableLiveData()
    val achievementsErrorResponse : LiveData<Exception> = _AchievementsErrorResponse
    private val _ProgressBar : MutableLiveData<Boolean> = MutableLiveData()
    val progressBar : LiveData<Boolean> = _ProgressBar


    fun getData ()
    {
        _ProgressBar.postValue(true)
        viewModelScope.launch { try {
        val response = repository.getAchievements()
        _AchievementsSuccessfullResponse.postValue(response)
    }
    catch (e : Exception)
    {
        _AchievementsErrorResponse.postValue(e)
    }
    }
        _ProgressBar.postValue(false)

    }
}