package com.begzod.coroutines

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.begzod.coroutines.databinding.ActivityMainBinding
import com.begzod.coroutines.retrofit.ApiClient
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        GlobalScope.launch(Dispatchers.Main){
            val l = ApiClient.getApiService().getMonies()
            binding.tvInfo.text = l.toString()
        }
    }
}