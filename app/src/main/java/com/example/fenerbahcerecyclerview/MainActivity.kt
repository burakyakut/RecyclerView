package com.example.fenerbahcerecyclerview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.fenerbahcerecyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var playerAdapter: PlayerAdapter
    private lateinit var recyclerView: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val playerList= arrayListOf<Player>(
            Player(R.drawable.volkan,"Volkan Demirel","Fenerbahçe","Kaleci"),
            Player(R.drawable.carlos,"Roberto Carlos","Fenerbahçe","Sol Bek"),
            Player(R.drawable.lugano,"Diego Lugano","Fenerbahçe","Stoper"),
            Player(R.drawable.kim,"Kim Min Jae","Fenerbahçe","Stoper"),
            Player(R.drawable.gokhan,"Gökhan Gönül","Fenerbahçe","Sağ Bek"),
            Player(R.drawable.appiah,"Stephen Appiah","Fenerbahçe","Orta Saha"),
            Player(R.drawable.alex,"Alex De Souza","Fenerbahçe","On Numara"),
            Player(R.drawable.arda,"Arda Güler","Fenerbahçe","On Numara"),
            Player(R.drawable.anelka,"Nicolas Anelka","Fenerbahçe","Sağ Kanat"),
            Player(R.drawable.deivid,"Deivid De Souza","Fenerbahçe","Sol Kanat"),
            Player(R.drawable.persie,"Robin Van Persie","Fenerbahçe","Forvet"),
        )

        playerAdapter=PlayerAdapter(playerList)

        binding.recyclerView.layoutManager=LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
        binding.recyclerView.adapter=playerAdapter
        binding.recyclerView.setHasFixedSize(true)



    }
}