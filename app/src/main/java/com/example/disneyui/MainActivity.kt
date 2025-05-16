package com.example.disneyui

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView =findViewById<RecyclerView>(R.id.sectionRecyclerView)
        recyclerView.layoutManager=LinearLayoutManager(this)


        val tumBasliklar = listOf(
            Baslik("Disney+ da Yeni", listOf(
                Film("frozen", R.drawable.frozen),
                Film("herkul", R.drawable.herkul),
                Film("mickey", R.drawable.mickey),
                Film("deniz kızı", R.drawable.deniz)

            )),
            Baslik("Sna Özel Öneriler", listOf(
                Film("frozen", R.drawable.frozen),
                Film("herkul", R.drawable.herkul),
                Film("mickey", R.drawable.mickey),
                Film("deniz kızı", R.drawable.deniz)

            ))


        )
        recyclerView.adapter = BaslikAdapter(tumBasliklar)


    }
}