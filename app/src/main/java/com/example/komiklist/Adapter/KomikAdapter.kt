package com.example.komiklist.Adapter

import android.annotation.SuppressLint
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.cardview.widget.CardView
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.komiklist.Data.Komik
import com.example.komiklist.DetailActivity
import com.example.komiklist.R

class KomikAdapter (private val listHero: ArrayList<Komik>): RecyclerView.Adapter<KomikAdapter.KomikViewViewHolder>() {
    class KomikViewViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_Cv_Home)
        var tvName: TextView = itemView.findViewById(R.id.tv_Judul_Komik_home)
        var tvAuthor: TextView = itemView.findViewById(R.id.tv_Author_home)
        var tvSynopsis: TextView = itemView.findViewById(R.id.tv_synopsis_home)
        var tvStatus: TextView = itemView.findViewById(R.id.tv_status_home)
        var tvDetail: TextView = itemView.findViewById(R.id.tv_detail_home)
        var cvItem: CardView = itemView.findViewById(R.id.cv_item_komik)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): KomikViewViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_cardview_komik, parent, false)
        return KomikViewViewHolder(view)
    }

    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(holder: KomikViewViewHolder, position: Int) {
        val komik = listHero[position]
        Glide.with(holder.itemView.context)
            .load(komik.Dphoto)
            .apply(RequestOptions().override(350, 550))
            .into(holder.imgPhoto)
        holder.tvName.text = komik.DkomikNama
        holder.tvAuthor.text = " "+komik.DkomikAuthor
        holder.tvSynopsis.text = komik.DkomikSynopsis
        holder.tvStatus.text = " "+komik.DkomikStatus
        holder.cvItem.setOnClickListener {
//            Toast.makeText(holder.itemView.context, "Data pindah = " + komik.DkomikAuthor, Toast.LENGTH_SHORT).show()
//            println(komik)
            val intent = Intent(holder.itemView.context, DetailActivity::class.java)
            intent.putExtra(DetailActivity.EXTRA_JUDULKOMIK, komik.DkomikNama)
            intent.putExtra(DetailActivity.EXTRA_AUTHORKOMIK, komik.DkomikAuthor)
            intent.putExtra(DetailActivity.EXTRA_GENREKOMIK, komik.DkomikGenre)
            intent.putExtra(DetailActivity.EXTRA_TAHUNKOMIK, komik.DkomikTahun)
            intent.putExtra(DetailActivity.EXTRA_STATUSKOMIK, komik.DkomikStatus)
            intent.putExtra(DetailActivity.EXTRA_JENISKOMIK, komik.DkomikJenis)
            intent.putExtra(DetailActivity.EXTRA_SERIALKOMIK, komik.DkomikSerialization)
            intent.putExtra(DetailActivity.EXTRA_RATINGKOMIK, komik.DkomikRating)
            intent.putExtra(DetailActivity.EXTRA_CHAPTERKOMIK, komik.DkomikChapter)
            intent.putExtra(DetailActivity.EXTRA_SYNOPSISKOMIK, komik.DkomikSynopsis)
            intent.putExtra(DetailActivity.ExtraGambar, komik.Dphoto)
            holder.itemView.context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return listHero.size
    }

}
