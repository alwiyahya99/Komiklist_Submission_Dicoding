package com.example.komiklist.Data

import com.example.komiklist.R

//"",
object KomikData {
    private val komikNama = arrayOf(
        "One Piece",
        "Shingeki no Kyojin",
    )
    private val komikAuthor = arrayOf(
        " Echiro Oda",
        " Hajime Isayama "
    )
    private val komikSynopsis = arrayOf(
        "Manga One Piece yang dibuat oleh komikus bernama Oda Eiichiro ini bercerita tentang Gol D. Roger, seorang pria yang disebut sebagai \"Raja Bajak Laut,\" akan dieksekusi oleh Pemerintah Dunia. Tapi tepat sebelum kematiannya, dia mengkonfirmasi keberadaan harta karun besar, One Piece, yang terletak di suatu tempat di lautan luas yang dikenal sebagai Grand Line. Mengumumkan bahwa One Piece dapat diklaim oleh siapa saja yang cukup layak untuk mencapainya, Raja Bajak Laut dieksekusi dan Zaman Bajak Laut Hebat dimulai. Dua puluh dua tahun kemudian, seorang pemuda bernama Monkey D.Luffy siap untuk memulai petualangannya sendiri, mencari One Piece dan berusaha untuk menjadi Raja Bajak Laut yang baru. Berbekal hanya topi jerami, perahu kecil, dan tubuh elastis, ia memulai perjalanan yang fantastis untuk mengumpulkan awaknya sendiri dan kapal yang layak yang akan membawa mereka melintasi Grand Line untuk mengklaim status terbesar di laut lepas.",
        "Centuries ago, mankind was slaughtered to near extinction by monstrous humanoid creatures called Titans, forcing humans to hide in fear behind enormous concentric walls. What makes these giants truly terrifying is that their taste for human flesh is not born out of hunger but what appears to be out of pleasure. To ensure their survival, the remnants of humanity began living within defensive barriers, resulting in one hundred years without a single titan encounter. However, that fragile calm is soon shattered when a colossal Titan manages to breach the supposedly impregnable outer wall, reigniting the fight for survival against the man-eating abominations. After witnessing a horrific personal loss at the hands of the invading creatures, Eren Yeager dedicates his life to their eradication by enlisting into the Survey Corps, an elite military unit that combats the merciless humanoids outside the protection of the walls. Eren, his adopted sister Mikasa Ackerman, and his childhood friend Armin Arlert join the brutal war against the Titans and race to discover a way of defeating them before the last walls are breached."
    )
    private val komikStatus = arrayOf(
        " Ongoing",
        " Finished"
    )
    private val komikGenre = arrayOf(
        " Action, Adventure, Fantasy",
        " Action, Award Winning, Drama"
    )
    private val komikTahun = arrayOf(
        " Jul 22, 1997",
        " Sep 9, 2009"
    )
    private val komikJenis = arrayOf(
        " Manga",
        " Manga"
    )
    private val komikSerialization = arrayOf(
        " Shounen Jump (Weekly)",
        " Bessatsu Shounen Magazine"
    )
    private val komikRating = arrayOf(
        "9.8",
        "8.56"
    )
    private val komikChapter = arrayOf(
        "1061",
        "141"
    )
    private val komikImages = intArrayOf(
        R.drawable.img_one_piece,
        R.drawable.img_aot
    )
    val lisData:ArrayList<Komik>
    get() {
        val list = arrayListOf<Komik>()
        for (position in komikNama.indices){
            val myKomik = Komik()
            myKomik.DkomikNama = komikNama[position]
            myKomik.DkomikAuthor = komikAuthor[position]
            myKomik.DkomikSynopsis = komikSynopsis[position]
            myKomik.DkomikStatus = komikStatus[position]
            myKomik.DkomikGenre = komikGenre[position]
            myKomik.DkomikTahun = komikTahun[position]
            myKomik.DkomikJenis = komikJenis[position]
            myKomik.DkomikSerialization = komikSerialization[position]
            myKomik.DkomikRating = komikRating[position]
            myKomik.DkomikChapter = komikChapter[position]
            myKomik.Dphoto = komikImages[position]
            list.add(myKomik)
        }
        return list
    }
}