package com.example.disneyui

data class Film (
    val baslik : String,
    val resimId :Int
)

data class Baslik(val baslik : String,
    val filmler:List<Film>
)