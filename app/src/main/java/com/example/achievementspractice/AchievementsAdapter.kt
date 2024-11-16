package com.example.achievementspractice

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.achievementspractice.data.models.AchievementsResponseModel
import com.example.achievementspractice.databinding.AchievementsItemBinding

class AchievementsAdapter(private val list: List<AchievementsResponseModel?>?) : RecyclerView.Adapter<AchievementsViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AchievementsViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = AchievementsItemBinding.inflate(inflater, parent, false)
        return AchievementsViewHolder(binding)
    }

    override fun getItemCount(): Int {
        list?.let { return list.size }
        return 0
    }

    override fun onBindViewHolder(holder: AchievementsViewHolder, position: Int) {
        TODO("Not yet implemented")
    }
}