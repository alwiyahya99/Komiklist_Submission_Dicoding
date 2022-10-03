package com.example.komiklist.Data

import com.example.komiklist.R

//"",
object KomikData {
    private val komikNama = arrayOf(
        "One Piece",
        "Shingeki no Kyojin",
        "Mob Psycho 100",
        "Spy x Family"
    )
    private val komikAuthor = arrayOf(
        " Echiro Oda",
        " Hajime Isayama",
        " ONE",
        " Tatsuya Endou"
    )
    private val komikSynopsis = arrayOf(
        "Manga One Piece yang dibuat oleh komikus bernama Oda Eiichiro ini bercerita tentang Gol D. Roger, seorang pria yang disebut sebagai \"Raja Bajak Laut,\" akan dieksekusi oleh Pemerintah Dunia. Tapi tepat sebelum kematiannya, dia mengkonfirmasi keberadaan harta karun besar, One Piece, yang terletak di suatu tempat di lautan luas yang dikenal sebagai Grand Line. Mengumumkan bahwa One Piece dapat diklaim oleh siapa saja yang cukup layak untuk mencapainya, Raja Bajak Laut dieksekusi dan Zaman Bajak Laut Hebat dimulai. Dua puluh dua tahun kemudian, seorang pemuda bernama Monkey D.Luffy siap untuk memulai petualangannya sendiri, mencari One Piece dan berusaha untuk menjadi Raja Bajak Laut yang baru. Berbekal hanya topi jerami, perahu kecil, dan tubuh elastis, ia memulai perjalanan yang fantastis untuk mengumpulkan awaknya sendiri dan kapal yang layak yang akan membawa mereka melintasi Grand Line untuk mengklaim status terbesar di laut lepas.",
        "Centuries ago, mankind was slaughtered to near extinction by monstrous humanoid creatures called Titans, forcing humans to hide in fear behind enormous concentric walls. What makes these giants truly terrifying is that their taste for human flesh is not born out of hunger but what appears to be out of pleasure. To ensure their survival, the remnants of humanity began living within defensive barriers, resulting in one hundred years without a single titan encounter. However, that fragile calm is soon shattered when a colossal Titan manages to breach the supposedly impregnable outer wall, reigniting the fight for survival against the man-eating abominations. After witnessing a horrific personal loss at the hands of the invading creatures, Eren Yeager dedicates his life to their eradication by enlisting into the Survey Corps, an elite military unit that combats the merciless humanoids outside the protection of the walls. Eren, his adopted sister Mikasa Ackerman, and his childhood friend Armin Arlert join the brutal war against the Titans and race to discover a way of defeating them before the last walls are breached."
        ,"Shigeo \"Mob\" Kageyama is an eighth-grade student blessed with extraordinary psychic powers. However, Mob decides to suppress his abilities in public due to its destructive and conspicuous nature. To keep his psychic powers honed, he works under Arataka Reigen—a self-proclaimed esper looking to make use of Mob's skills. Alongside Reigen, Mob spends his days exorcising evil spirits at Reigen's behest. With the simple wish to impress his childhood friend Tsubomi Takane, Mob works toward making himself more desirable. But troubles keep on bombarding his daily life, slowly breaking his shackled feelings. With his repressed emotions welling up, there's no telling what will happen once he reaches his limit."
        ,"For the agent known as \"Twilight,\" no order is too tall if it is for the sake of peace. Operating as Westalis' master spy, Twilight works tirelessly to prevent extremists from sparking a war with neighboring country Ostania. For his latest mission, he must investigate Ostanian politician Donovan Desmond by infiltrating his son's school: the prestigious Eden Academy. Thus, the agent faces the most difficult task of his career: get married, have a child, and play family. Twilight, or \"Loid Forger,\" quickly adopts the unassuming orphan Anya to play the role of a six-year-old daughter and prospective Eden Academy student. For a wife, he comes across Yor Briar, an absent-minded office worker who needs a pretend partner of her own to impress her friends. However, Loid is not the only one with a hidden nature. Yor moonlights as the lethal assassin \"Thorn Princess.\" For her, marrying Loid creates the perfect cover. Meanwhile, Anya is not the ordinary girl she appears to be; she is an esper, the product of secret experiments that allow her to read minds. Although she uncovers their true identities, Anya is thrilled that her new parents are cool secret agents! She would never tell them, of course. That would ruin the fun. Under the guise of \"The Forgers,\" the spy, the assassin, and the esper must act as a family while carrying out their own agendas. Although these liars and misfits are only playing parts, they soon find that family is about far more than blood relations."

    )
    private val komikStatus = arrayOf(
        " Ongoing",
        " Finished",
        " Finished",
        " Publishing"
    )
    private val komikGenre = arrayOf(
        " Action, Adventure, Fantasy",
        " Action, Award Winning, Drama",
        " Action, Comedy, Supernatural",
        " Action, Comedy"
    )
    private val komikTahun = arrayOf(
        " Jul 22, 1997",
        " Sep 9, 2009",
        " Apr 18, 2012",
        " Mar 25, 2019"
    )
    private val komikJenis = arrayOf(
        " Manga",
        " Manga",
        " Manga",
        " Manga"
    )
    private val komikSerialization = arrayOf(
        " Shounen Jump (Weekly)",
        " Bessatsu Shounen Magazine",
        " MangaONE",
        " Shounen Jump+"
    )
    private val komikRating = arrayOf(
        "9.8",
        "8.56",
        "8.60",
        "8.66"
    )
    private val komikChapter = arrayOf(
        "1061",
        "141",
        "109",
        "68"
    )
    private val komikImages = intArrayOf(
        R.drawable.img_one_piece,
        R.drawable.img_aot,
        R.drawable.img_mobpsycho,
        R.drawable.img_spyxfamily
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