package com.example.achievementspractice
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    private val mainViewModel : MainViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initObserve()
    }

    private fun initObserve() {
        mainViewModel.achievementsSuccessfulResponse.observe(this){show ->
            Toast.makeText(this, show.toString(), Toast.LENGTH_LONG).show()
        }
        mainViewModel.achievementsErrorResponse.observe(this){show ->
            Toast.makeText(this, show.toString(), Toast.LENGTH_LONG).show()
        }
    }

}