package com.example.fenerbahcerecyclerview

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.fenerbahcerecyclerview.databinding.CardviewlayoutBinding

class PlayerAdapter(private val playerList:ArrayList<Player>):RecyclerView.Adapter<PlayerAdapter.PlayerHolder>() {

    class PlayerHolder(val cardviewlayoutBinding: CardviewlayoutBinding):RecyclerView.ViewHolder(cardviewlayoutBinding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlayerHolder {
        return PlayerHolder(CardviewlayoutBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun getItemCount(): Int {
        return playerList.size
    }

    override fun onBindViewHolder(holder: PlayerHolder, position: Int) {
        val player=playerList[position]
        holder.cardviewlayoutBinding.cardViewLayoutImage.setImageResource(player.image)
        holder.cardviewlayoutBinding.cardViewLayoutName.text=player.name

        holder.itemView.setOnClickListener {
            val intent=Intent(holder.itemView.context,DetailActivity::class.java)
            intent.putExtra("image",player.image)
            intent.putExtra("name",player.name)
            intent.putExtra("takim",player.takim)
            intent.putExtra("pozisyon",player.pozisyon)
            holder.itemView.context.startActivity(intent)
        }


    }

}