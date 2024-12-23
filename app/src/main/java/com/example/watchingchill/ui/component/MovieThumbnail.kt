package com.example.watchingchill.ui.component

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun MovieThumbnail(
    modifier: Modifier = Modifier,
    @DrawableRes img : Int
){
    Image(
        painter = painterResource(img),
        contentDescription = null,
        contentScale = ContentScale.Crop,
        modifier = modifier
            .width(120.dp)// Ensures the image fills the width of the parent
            .height(230.dp) // Restricts the height of the image
            .border(
                width = 1.dp,
                color = Color.White
            )
            .padding(8.dp)
        )
}