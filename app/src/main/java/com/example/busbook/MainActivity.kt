package com.example.busbook

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.busbook.databinding.ActivityHostBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityHostBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHostBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}
