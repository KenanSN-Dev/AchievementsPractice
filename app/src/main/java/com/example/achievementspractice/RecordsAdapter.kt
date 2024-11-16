package com.example.achievementspractice

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Recycler
import com.example.achievementspractice.data.models.RecordModel
import com.example.achievementspractice.databinding.RecordsItemBinding

class RecordsAdapter(private val list: List<RecordModel>) : RecyclerView.Adapter<RecordsViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecordsViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = RecordsItemBinding.inflate(inflater, parent, false)
        return RecordsViewHolder(binding)
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: RecordsViewHolder, position: Int) {
        TODO("Not yet implemented")
    }
}