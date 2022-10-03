package com.example.komiklist

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.komiklist.Adapter.KomikAdapter
import com.example.komiklist.Data.Komik
import com.example.komiklist.Data.KomikData

class MainActivity : AppCompatActivity() {
    private lateinit var rvKomik: RecyclerView
    //memanggil data yang sudah dibuat pada HeroesData.kt
    private var list: ArrayList<Komik> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()

        val aboutActivity : ImageView = findViewById(R.id.icn_about)
        aboutActivity.setOnClickListener{
            val intent = Intent(this, AboutActivity::class.java)
            startActivity(intent)
        }
        rvKomik = findViewById(R.id.rv_komik)
        rvKomik.setHasFixedSize(true)
        list.addAll(KomikData.lisData)
        showRecyclerCardView()
    }

    // CardView Layout
    private fun showRecyclerCardView() {
        rvKomik.layoutManager = LinearLayoutManager(this)
        val komikAdapter = KomikAdapter(list)
        rvKomik.adapter = komikAdapter
    }
}