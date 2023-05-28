package com.example.fenerbahcerecyclerview

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fenerbahcerecyclerview.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val intent=intent
        val image=intent.getIntExtra("image",0)
        val name=intent.getStringExtra("name")
        val takim=intent.getStringExtra("takim")
        val pozisyon=intent.getStringExtra("pozisyon")

        binding.detailActivityImage.setImageResource(image)
        binding.detailActivityName.text=name
        binding.detailActivityTakim.text=takim
        binding.detailActivityPozisyon.text=pozisyon







    }
}