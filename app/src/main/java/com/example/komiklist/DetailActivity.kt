package com.example.komiklist

import android.annotation.SuppressLint
import android.content.Intent
import android.media.Image
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions


class DetailActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_JUDULKOMIK = "extra_name"
        const val EXTRA_AUTHORKOMIK = "extra_author"
        const val EXTRA_GENREKOMIK = "extra_genre"
        const val EXTRA_TAHUNKOMIK = "extra_tahun"
        const val EXTRA_STATUSKOMIK = "extra_status"
        const val EXTRA_JENISKOMIK = "extra_jenis"
        const val EXTRA_SERIALKOMIK = "extra_serial"
        const val EXTRA_RATINGKOMIK = "extra_rating"
        const val EXTRA_CHAPTERKOMIK = "extra_chapter"
        const val EXTRA_SYNOPSISKOMIK = "extra_synopsis"
        const val ExtraGambar = ""
    }

    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        supportActionBar?.hide()

        val imgDetail : ImageView = findViewById(R.id.img_Detail_Activity)
        val tvJudulKomik : TextView = findViewById(R.id.tv_Judul_Komik_Detail)
        val tvAuthorKomik : TextView = findViewById(R.id.tv_Author_Komik_Detail)
        val tvGenreKomik : TextView = findViewById(R.id.tv_Genre_Komik_Detail)
        val tvTahunKomik : TextView = findViewById(R.id.tv_Tahun_Komik_Detail)
        val tvStatusKomik : TextView = findViewById(R.id.tv_Status_Komik_Detail)
        val tvJenisKomik : TextView = findViewById(R.id.tv_Jenis_Komik_Detail)
        val tvSerialKomik : TextView = findViewById(R.id.tv_Serial_Komik_Detail)
        val tvRatingKomik : TextView = findViewById(R.id.tv_Rating_Komik_Detail)
        val tvChapterKomik : TextView = findViewById(R.id.tv_Chapter_Komik_Detail)
        val tvSynopsisKomik : TextView = findViewById(R.id.tv_Synopsisi_Komik_Detail)
        val clAction_share : ConstraintLayout = findViewById(R.id.action_share)
        val btn_back : ImageView = findViewById(R.id.img_Back_Detail)

        val intent = intent
        val dataIntent = intent.getIntExtra(ExtraGambar,0)
        val judul = intent.getStringExtra(EXTRA_JUDULKOMIK)
        val author = intent.getStringExtra(EXTRA_AUTHORKOMIK)
        val genre = intent.getStringExtra(EXTRA_GENREKOMIK)
        val tahun = intent.getStringExtra(EXTRA_TAHUNKOMIK)
        val status = intent.getStringExtra(EXTRA_STATUSKOMIK)
        val jenis = intent.getStringExtra(EXTRA_JENISKOMIK)
        val serial = intent.getStringExtra(EXTRA_SERIALKOMIK)
        val rating = intent.getStringExtra(EXTRA_RATINGKOMIK)
        val chapter = intent.getStringExtra(EXTRA_CHAPTERKOMIK)
        val synopsis = intent.getStringExtra(EXTRA_SYNOPSISKOMIK)
//        Toast.makeText(getApplicationContext(), dataIntent, Toast.LENGTH_SHORT).show();
        tvJudulKomik.text = judul
        tvAuthorKomik.text = author
        tvGenreKomik.text = genre
        tvTahunKomik.text = tahun
        tvStatusKomik.text = status
        tvJenisKomik.text = jenis
        tvSerialKomik.text = serial
        tvRatingKomik.text = rating
        tvChapterKomik.text = chapter
        tvSynopsisKomik.text = synopsis
        Glide.with(this)
            .load(dataIntent)
            .apply(RequestOptions())
            .into(imgDetail)

        btn_back.setOnClickListener{
            onBackPressed()
        }

        val url = "www.contohalamat.com/"+ EXTRA_JUDULKOMIK
        clAction_share.setOnClickListener{
            val intentShare = Intent(Intent.ACTION_SEND)
            intent.type = "share/Komik"
            intent.putExtra("Share this", url)
            val chooser = Intent.createChooser(intentShare, "Share using.....")
            startActivity(chooser)
        }
    }
}