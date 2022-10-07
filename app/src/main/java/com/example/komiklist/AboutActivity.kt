package com.example.komiklist

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class AboutActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)
        supportActionBar?.hide()

        val btn_back : ImageView = findViewById(R.id.img_Back_Detail)
        btn_back.setOnClickListener{
            onBackPressed()
        }
    }
}