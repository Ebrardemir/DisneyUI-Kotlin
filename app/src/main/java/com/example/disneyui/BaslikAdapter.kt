package com.example.disneyui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class BaslikAdapter(private val baslikList :List<Baslik>) :  RecyclerView.Adapter<BaslikAdapter.BaslikViewHolder>() {

    inner class BaslikViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val titleText: TextView = view.findViewById(R.id.baslikTitle)
        val filmRecyclerView: RecyclerView = view.findViewById(R.id.filmRecyclerView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaslikViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_baslik, parent, false)
        return BaslikViewHolder(view)
    }

    override fun onBindViewHolder(holder: BaslikViewHolder, position: Int) {
        val baslik = baslikList[position]
        holder.titleText.text = baslik.baslik
        holder.filmRecyclerView.layoutManager =
            LinearLayoutManager(holder.itemView.context, RecyclerView.HORIZONTAL, false)
        holder.filmRecyclerView.adapter = FilmAdapter(baslik.filmler)
    }

    override fun getItemCount() = baslikList.size
}