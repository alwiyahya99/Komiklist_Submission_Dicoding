package com.example.komiklist.Data

import com.example.komiklist.R

//"",
object KomikData {
    private val komikNama = arrayOf(
        "One Piece",
        "Shingeki no Kyojin",
        "Mob Psycho 100",
        "Spy x Family",
        "Fullmetal Alchemist",
        "Berserk",
        "Hunter x Hunter",
        "Chainsaw Man",
        "One Punch-Man",
        "Haikyuu!!",
        "Vinland Saga",
        "Slam Dunk",
        "Jujutsu Kaisen"
    )
    private val komikAuthor = arrayOf(
        " Echiro Oda",
        " Hajime Isayama",
        " ONE",
        " Tatsuya Endou",
        " Hiromu  Arakawa",
        " Kentarou  Miura",
        " Yoshihiro Togashi",
        " Tatsuki  Fujimoto",
        " Yusuke  Murata",
        " Haruichi  Furudate",
        " Makoto  Yukimura",
        " Takehiko  Inoue",
        " Gege  Akutami"
    )
    private val komikSynopsis = arrayOf(
        "Gol D. Roger, a man referred to as the \"Pirate King,\" is set to be executed by the World Government. But just before his demise, he confirms the existence of a great treasure, One Piece, located somewhere within the vast ocean known as the Grand Line. Announcing that One Piece can be claimed by anyone worthy enough to reach it, the Pirate King is executed and the Great Age of Pirates begins. Twenty-two years later, a young man by the name of Monkey D. Luffy is ready to embark on his own adventure, searching for One Piece and striving to become the new Pirate King. Armed with just a straw hat, a small boat, and an elastic body, he sets out on a fantastic journey to gather his own crew and a worthy ship that will take them across the Grand Line to claim the greatest status on the high seas."
        ,"Centuries ago, mankind was slaughtered to near extinction by monstrous humanoid creatures called Titans, forcing humans to hide in fear behind enormous concentric walls. What makes these giants truly terrifying is that their taste for human flesh is not born out of hunger but what appears to be out of pleasure. To ensure their survival, the remnants of humanity began living within defensive barriers, resulting in one hundred years without a single titan encounter. However, that fragile calm is soon shattered when a colossal Titan manages to breach the supposedly impregnable outer wall, reigniting the fight for survival against the man-eating abominations. After witnessing a horrific personal loss at the hands of the invading creatures, Eren Yeager dedicates his life to their eradication by enlisting into the Survey Corps, an elite military unit that combats the merciless humanoids outside the protection of the walls. Eren, his adopted sister Mikasa Ackerman, and his childhood friend Armin Arlert join the brutal war against the Titans and race to discover a way of defeating them before the last walls are breached."
        ,"Shigeo \"Mob\" Kageyama is an eighth-grade student blessed with extraordinary psychic powers. However, Mob decides to suppress his abilities in public due to its destructive and conspicuous nature. To keep his psychic powers honed, he works under Arataka Reigen—a self-proclaimed esper looking to make use of Mob's skills. Alongside Reigen, Mob spends his days exorcising evil spirits at Reigen's behest. With the simple wish to impress his childhood friend Tsubomi Takane, Mob works toward making himself more desirable. But troubles keep on bombarding his daily life, slowly breaking his shackled feelings. With his repressed emotions welling up, there's no telling what will happen once he reaches his limit."
        ,"For the agent known as \"Twilight,\" no order is too tall if it is for the sake of peace. Operating as Westalis' master spy, Twilight works tirelessly to prevent extremists from sparking a war with neighboring country Ostania. For his latest mission, he must investigate Ostanian politician Donovan Desmond by infiltrating his son's school: the prestigious Eden Academy. Thus, the agent faces the most difficult task of his career: get married, have a child, and play family. Twilight, or \"Loid Forger,\" quickly adopts the unassuming orphan Anya to play the role of a six-year-old daughter and prospective Eden Academy student. For a wife, he comes across Yor Briar, an absent-minded office worker who needs a pretend partner of her own to impress her friends. However, Loid is not the only one with a hidden nature. Yor moonlights as the lethal assassin \"Thorn Princess.\" For her, marrying Loid creates the perfect cover. Meanwhile, Anya is not the ordinary girl she appears to be; she is an esper, the product of secret experiments that allow her to read minds. Although she uncovers their true identities, Anya is thrilled that her new parents are cool secret agents! She would never tell them, of course. That would ruin the fun. Under the guise of \"The Forgers,\" the spy, the assassin, and the esper must act as a family while carrying out their own agendas. Although these liars and misfits are only playing parts, they soon find that family is about far more than blood relations."
        ,"Alchemists are knowledgeable and naturally talented individuals who can manipulate and modify matter due to their art. Yet despite the wide range of possibilities, alchemy is not as all-powerful as most would believe. Human transmutation is strictly forbidden, and whoever attempts it risks severe consequences. Even so, siblings Edward and Alphonse Elric decide to ignore this great taboo and bring their mother back to life. Unfortunately, not only do they fail in resurrecting her, they also pay an extremely high price for their arrogance: Edward loses his left leg and Alphonse his entire body. Furthermore, Edward also gives up his right arm in order to seal his brother's soul into a suit of armor. Years later, the young alchemists travel across the country looking for the Philosopher's Stone, in the hopes of recovering their old bodies with its power. However, their quest for the fated stone also leads them to unravel far darker secrets than they could ever imagine."
        ,"Guts, a former mercenary now known as the \"Black Swordsman,\" is out for revenge. After a tumultuous childhood, he finally finds someone he respects and believes he can trust, only to have everything fall apart when this person takes away everything important to Guts for the purpose of fulfilling his own desires. Now marked for death, Guts becomes condemned to a fate in which he is relentlessly pursued by demonic beings. Setting out on a dreadful quest riddled with misfortune, Guts, armed with a massive sword and monstrous strength, will let nothing stop him, not even death itself, until he is finally able to take the head of the one who stripped him—and his loved one—of their humanity."
        ,"Secret treasure hoards, undiscovered wealth... mystical places, unexplored frontiers... 'The mysterious unknown.' There's magic in such words for those captivated by its spell. They are called 'Hunters'!\" Gon Freecss wants to become a Hunter so he can find his father, a man who abandoned him to pursue a life of adventure. But it's not that simple: only one in one hundred thousand can pass the Hunter Exam, and that is just the first obstacle on his journey. During the Hunter Exam, Gon befriends many other potential Hunters, such as the mysterious Killua; the revenge-driven Kurapika; and Leorio, who aims to become a doctor. There's a world of adventure and peril awaiting, and those who embrace it with open arms can become the greatest Hunters of them all!."
        ,"Denji has a simple dream—to live a happy and peaceful life, spending time with a girl he likes. This is a far cry from reality, however, as Denji is forced by the yakuza into killing devils in order to pay off his crushing debts. Using his pet devil Pochita as a weapon, he is ready to do anything for a bit of cash. Unfortunately, he has outlived his usefulness and is murdered by a devil in contract with the yakuza. However, in an unexpected turn of events, Pochita merges with Denji's dead body and grants him the powers of a chainsaw devil. Now able to transform parts of his body into chainsaws, a revived Denji uses his new abilities to quickly and brutally dispatch his enemies. Catching the eye of the official devil hunters who arrive at the scene, he is offered work at the Public Safety Bureau as one of them. Now with the means to face even the toughest of enemies, Denji will stop at nothing to achieve his simple teenage dreams."
        ,"After rigorously training for three years, the ordinary Saitama has gained immense strength which allows him to take out anyone and anything with just one punch. He decides to put his new skill to good use by becoming a hero. However, he quickly becomes bored with easily defeating monsters, and wants someone to give him a challenge to bring back the spark of being a hero. Upon bearing witness to Saitama's amazing power, Genos, a cyborg, is determined to become Saitama's apprentice. During this time, Saitama realizes he is neither getting the recognition that he deserves nor known by the people due to him not being a part of the Hero Association. Wanting to boost his reputation, Saitama decides to have Genos register with him, in exchange for taking him in as a pupil. Together, the two begin working their way up toward becoming true heroes, hoping to find strong enemies and earn respect in the process."
        ,"The whistle blows. The ball is up. A dig. A set. A spike. Volleyball. A sport where two teams face off, separated by a formidable, wall-like net. The \"Little Giant,\" standing at only 170 cm, overcomes the towering net and the wall of blockers. The awe-inspired Shouyou Hinata looks on at the ace's crow-like figure. Determined to reach great heights like the Little Giant, small-statured Hinata finally manages to form a team in his last year of junior high school, and enters his first volleyball tournament. However, his team is utterly defeated in their first game against the powerhouse school Kitagawa Daiichi, led by the genius, but oppressive setter dubbed the \"King of the Court,\" Tobio Kageyama. Hinata enrolls into Karasuno High School seeking to take revenge against Kageyama in an official high school match and to follow in the Little Giant's footsteps—but his plans are ruined when he opens the gymnasium door to find Kageyama as one of his teammates. Now, Hinata must establish himself on the team and work alongside the problematic Kageyama to overcome his shortcomings and to fulfill his dream of making it to the top of the high school volleyball world."
        ,"Thorfinn, son of one of the Vikings' greatest warriors, is among the finest fighters in the merry band of mercenaries run by the cunning Askeladd, an impressive feat for a person his age. However, Thorfinn is not part of the group for the plunder it entails—instead, for having caused his family great tragedy, the boy has vowed to kill Askeladd in a fair duel. Not yet skilled enough to defeat him, but unable to abandon his vengeance, Thorfinn spends his boyhood with the mercenary crew, honing his skills on the battlefield among the war-loving Danes, where killing is just another pleasure of life. One day, when Askeladd receives word that Danish prince Canute has been taken hostage, he hatches an ambitious plot—one that will decide the next King of England and drastically alter the lives of Thorfinn, Canute, and himself. Set in 11th-century Europe, Vinland Saga tells a bloody epic in an era where violence, madness, and injustice are inescapable, providing a paradise for the battle-crazed and utter hell for the rest who live in it."
        ,"Hanamichi Sakuragi, a tall, boisterous teenager with flame-red hair and physical strength beyond his years, is eager to put an end to his rejection streak of 50 and finally score a girlfriend as he begins his first year of Shohoku High. However, his reputation for delinquency and destructiveness precedes him, and most of his fellow students subsequently avoid him like the plague. As his first day of school ends, he is left with two strong thoughts: \"I hate basketball\" and \"I need a girlfriend.\" Haruko Akagi, ignorant of Hanamichi's history of misbehavior, notices his immense height and unwittingly approaches him, asking whether or not he likes basketball. Overcome by the fact that a girl is speaking to him, the red-haired giant blurts out a yes despite his true feelings. At the gym, Haruko asks if he can do a slam dunk. Though a complete novice, Hanamachi palms the ball and makes the leap...but overshoots, slamming his head into the backboard. Amazed by his near-inhuman physical abilities, Haruko quickly notifies the school's basketball captain of his feat. With this, Hanamichi is unexpectedly thrust into a world of competition for a girl he barely knows, but he soon discovers that there is perhaps more to basketball than he once thought."
        ,"Hidden in plain sight, an age-old conflict rages on. Supernatural monsters known as \"Curses\" terrorize humanity from the shadows, and powerful humans known as \"Jujutsu\" sorcerers use mystical arts to exterminate them. When high school student Yuuji Itadori finds a dried-up finger of the legendary Curse Sukuna Ryoumen, he suddenly finds himself joining this bloody conflict. Attacked by a Curse attracted to the finger's power, Yuuji makes a reckless decision to protect himself, gaining the power to combat Curses in the process but also unwittingly unleashing the malicious Sukuna into the world once more. Though Yuuji can control and confine Sukuna to his own body, the Jujutsu world classifies Yuuji as a dangerous, high-level Curse who must be exterminated. Detained and sentenced to death, Yuuji meets Satoru Gojou—a teacher at Jujutsu High School—who explains that despite his imminent execution, there is an alternative for him. Being a rare vessel to Sukuna, if Yuuji were to die, then Sukuna would perish too. Therefore, if Yuuji were to consume the many other remnants of Sukuna, then Yuuji's subsequent execution would truly eradicate the malicious demon. Taking up this chance to make the world safer and live his life for a little longer, Yuuji enrolls in Jujutsu High, jumping headfirst into a harsh and unforgiving battlefield."

    )
    private val komikStatus = arrayOf(
        " Ongoing",
        " Finished",
        " Finished",
        " Publishing",
        " Finished",
        " Publishing",
        " On Hiatus",
        " Publishing",
        " Publishing",
        " Finished",
        " Publishing",
        " Finished",
        " Publishing",
    )
    private val komikGenre = arrayOf(
        " Action, Adventure, Fantasy",
        " Action, Award Winning, Drama",
        " Action, Comedy, Supernatural",
        " Action, Comedy",
        " Action, Adventure,  Drama, Fantasy",
        " Action, Adventure,  Drama, Fantasy, Horror, Supernatural",
        " Action, Adventure, Fantasy",
        " Action, Award Winning, Supernatural",
        " Action, Comedy",
        " ward Winning, Sports",
        " Action, Adventure, Award Winning, Drama",
        " Award Winning, Sports",
        " Action, Fantasy"
    )
    private val komikTahun = arrayOf(
        " Jul 22, 1997",
        " Sep 9, 2009",
        " Apr 18, 2012",
        " Mar 25, 2019",
        " Jul 12, 2001",
        " Aug 25, 1989",
        " Mar 3, 1998",
        " Dec 3, 2018",
        " Jun 14, 2012",
        " Feb 20, 2012",
        " Apr 13, 200",
        " Sep 18, 1990",
        " Mar 5, 2018"
    )
    private val komikJenis = arrayOf(
        " Manga",
        " Manga",
        " Manga",
        " Manga",
        " Manga",
        " Manga",
        " Manga",
        " Manga",
        " Manga",
        " Manga",
        " Manga" ,
        " Manga" ,
        " Manga"
    )
    private val komikSerialization = arrayOf(
        " Shounen Jump (Weekly)",
        " Bessatsu Shounen Magazine",
        " MangaONE",
        " Shounen Jump+",
        " Shounen Gangan",
        " Young Animal",
        " Shounen Jump (Weekly)",
        " Shounen Jump+" ,
        " Tonari no Young Jump",
        " Shounen Jump (Weekly)" ,
        " Afternoon" ,
        " hounen Jump (Weekly)" ,
        " Shounen Jump (Weekly)"
    )
    private val komikRating = arrayOf(
        "9.8",
        "8.56",
        "8.60",
        "8.66",
        "9.04",
        "9.46",
        "8.71",
        "8.74",
        "8.75",
        "8.85",
        "9.00",
        "9.06",
        "8.55"
    )
    private val komikChapter = arrayOf(
        "1061",
        "141",
        "109",
        "68",
        "116",
        "358",
        "390",
        "104",
        "107",
        "407",
        "196",
        "276",
        "198"
    )
    private val komikImages = intArrayOf(
        R.drawable.img_one_piece,
        R.drawable.img_aot,
        R.drawable.img_mobpsycho,
        R.drawable.img_spyxfamily,
        R.drawable.img_fullmetal,
        R.drawable.img_berserk,
        R.drawable.img_hunterxhunter,
        R.drawable.img_chainsaw,
        R.drawable.img_onepunchman,
        R.drawable.img_haikyuu,
        R.drawable.img_vinlandsaga,
        R.drawable.img_slamdungk,
        R.drawable.img_jujutsukaisen,
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