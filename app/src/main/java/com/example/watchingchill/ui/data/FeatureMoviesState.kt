package com.example.watchingchill.ui.data

import androidx.annotation.DrawableRes
import com.example.watchingchill.R

data class FeatureMoviesState(
    val id : Int,
    @DrawableRes val img : Int,
    val tittle : String,
    val description : String,
    val timeslot: List<String>
)
val FeatureMoviesData= listOf(
    FeatureMoviesState(
        id = 0,
        img = R.drawable.parasite2019,
        tittle = "Parsite",
        description = "The struggling Kim family sees an opportunity when the son starts working for the wealthy Park family. Soon, all of them find a way to work within the same household and start living a parasitic life.",
        timeslot = listOf(
            "3:00 PM",
            "6:00 PM",
            "10:00 PM"
        )
    ),
    FeatureMoviesState(
        id = 1,
        img = R.drawable.prestige,
        tittle = "The Prestige",
        description = "Two friends and fellow magicians become bitter enemies after a sudden tragedy. As they devote themselves to this rivalry, they make sacrifices that bring them fame but, with terrible consequences.",
        timeslot = listOf(
            "1:00 PM",
            "3:00 PM",
            "8:00 PM"
        )
    ),
    FeatureMoviesState(
        id = 2,
        img = R.drawable.moana,
        tittle = "Moana",
        description = "Moana, daughter of chief Tui, embarks on a journey to return the heart of goddess Te Fitti from Maui, a demigod, after the plants and the fish on her island start dying due to a blight.",
        timeslot = listOf(
            "9:00 AM",
            "12:00 PM",
            "6:00 PM"
        )
    ),
    FeatureMoviesState(
        id = 3,
        img = R.drawable.scarface,
        tittle = "Scarface",
        description = "Tony Montana and his close friend Manny, build a strong drug empire in Miami. However as his power begins to grow, so does his ego and his enemies, and his own paranoia begins to plague his empire.",
        timeslot = listOf(
            "1:00 PM",
            "3:00 PM",
            "8:00 PM"
        )
    ),
    FeatureMoviesState(
        id = 4,
        img = R.drawable.scentofawomen,
        tittle = "Scent of a Woman",
        description = "A prep school student, who is in need of money, agrees to be the caregiver of a man with visual impairment while his family is away. Unbeknownst to him, the colonel has his own agenda for the weekend.",
        timeslot = listOf(
            "2:00 PM",
            "4:00 PM",
            "10:00 PM"
        )
    ),
    FeatureMoviesState(
        id = 5,
        img = R.drawable.bronxetale,
        tittle = "A Bronx Tale",
        description = "Calogero, a teenager from the Bronx, befriends Sonny, a local mobster who initiates him into the gangster ways. His life takes a turn for the worse when he falls in love with his classmate Jane.",
        timeslot = listOf(
            "4:00 PM",
            "7:00 PM",
            "11:00 PM"
        )
    ),
)
