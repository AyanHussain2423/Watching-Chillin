package com.example.watchingchill.ui.data

import androidx.annotation.DrawableRes
import com.example.watchingchill.R

data class ComingSoonState(
 val id : Int,
 @DrawableRes val img : Int
)
 val Comingsoonlist = listOf(
     ComingSoonState(
         id = 0,
         img = R.drawable.batman
     ),
     ComingSoonState(
         id = 1,
         img = R.drawable.conjuring
     ),
     ComingSoonState(
         id = 2,
         img = R.drawable.zootopia
     ),
     ComingSoonState(
         id = 3,
         img = R.drawable.dragon
     ),
 )
val Watchinglist = listOf(
    ComingSoonState(
        id = 0,
        img = R.drawable.bronxetale
    ),
    ComingSoonState(
        id = 1,
        img = R.drawable.oneflewover
    ),
    ComingSoonState(
        id = 2,
        img = R.drawable.darkknight
    ),
    ComingSoonState(
        id = 3,
        img = R.drawable.parasite2019
    ),
)
val StreamingMovieslist = listOf(
    ComingSoonState(
        id = 0,
        img = R.drawable.parasite2019
    ),
    ComingSoonState(
        id = 1,
        img = R.drawable.silenceoflambs
    ),
    ComingSoonState(
        id = 2,
        img = R.drawable.shawshank
    ),
    ComingSoonState(
        id = 3,
        img = R.drawable.scentofawomen
    ),
)
