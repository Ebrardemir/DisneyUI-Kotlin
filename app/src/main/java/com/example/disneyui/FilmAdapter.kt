package com.example.disneyui

import android.view.LayoutInflater
import android.view.View
import android.widget.ImageView
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class FilmAdapter(private val filmler : List<Film>) :RecyclerView.Adapter<FilmAdapter.FilmViewHolder>(){
    inner class FilmViewHolder(view: View) :RecyclerView.ViewHolder(view){
        val resimView:ImageView= view.findViewById(R.id.filmImageView)
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FilmViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_film, parent, false)
        return FilmViewHolder(view)
    }

    override fun onBindViewHolder(holder: FilmViewHolder, position: Int) {
        holder.resimView.setImageResource(filmler[position].resimId)
    }

    override fun getItemCount() = filmler.size
}