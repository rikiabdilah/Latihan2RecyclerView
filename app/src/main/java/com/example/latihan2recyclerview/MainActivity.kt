package com.example.latihan2recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.latihan2recyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var listNewsData = arrayListOf(
            ListNews("Lionel Messi", "12 Desember 2022", "The Best Fifa Player", R.drawable.img),
            ListNews("Lionel Messi", "12 Desember 2022", "The Best Fifa Player", R.drawable.img),
            ListNews("Lionel Messi", "12 Desember 2022", "The Best Fifa Player", R.drawable.img),
            ListNews("Lionel Messi", "12 Desember 2022", "The Best Fifa Player", R.drawable.img),
            ListNews("Lionel Messi", "12 Desember 2022", "The Best Fifa Player", R.drawable.img),
            ListNews("Lionel Messi", "12 Desember 2022", "The Best Fifa Player", R.drawable.img),
        )

        val adapterNews = NewsAdapter(listNewsData)

        val lm = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)

        binding.rvView.layoutManager = lm
        binding.rvView.adapter = adapterNews
    }
}