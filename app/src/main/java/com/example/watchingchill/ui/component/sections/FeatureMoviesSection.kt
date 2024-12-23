package com.example.watchingchill.ui.component.sections

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import com.example.watchingchill.ui.component.SectionHeader
import com.example.watchingchill.ui.data.FeatureMoviesState

@Composable
fun FeatureMoviesSection(
    modifier: Modifier = Modifier,
    data: List<FeatureMoviesState>
){
    Column(
        modifier = modifier.padding(horizontal = 2.dp),
        verticalArrangement = Arrangement.spacedBy(22.dp)
    ) {
        SectionHeader(
            text = "Featured Movies"
        )
        LazyRow (
            horizontalArrangement = Arrangement.spacedBy(16.dp)
        ){
            items(
                items = data,
                key = {it.id}
            ) {
                item->
                FeaturedMovies(item = item)
            }
        }
    }
}

@Composable
fun FeaturedMovies(
    modifier: Modifier = Modifier,
    item: FeatureMoviesState
){
    Column(
        modifier = modifier
            .width(224.dp)
    ) {
        Image(
            painter = painterResource(item.img),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = modifier.height(300.dp)
            )
        Spacer(
            modifier = modifier.height(8.dp)
        )
        Text(
            text = item.tittle,
            style = MaterialTheme.typography.bodyMedium
        )
        Spacer(
            modifier = modifier.height(8.dp)
        )
        Text(
            text = item.description,
            style = MaterialTheme.typography.bodySmall,
            maxLines = 3, // Limits the text to one line
            overflow = TextOverflow.Ellipsis // Adds ellipsis if text overflows
        )
        Spacer(
            modifier = modifier.height(18.dp)
        )
        Timeslotmovies(slot = item.timeslot)

    }
}

@Composable
fun Timeslotmovies(
    modifier: Modifier = Modifier,
    slot: List<String>
){
    Row (
        modifier = modifier,
        horizontalArrangement = Arrangement.spacedBy(6.dp)
    ){
        slot.onEach { slot -> timeslotfun(slots = slot) }
    }
}

@Composable
fun timeslotfun(
    modifier: Modifier = Modifier,
    slots: String
){
    Surface(
        modifier = modifier,
        shape = RoundedCornerShape(8.dp)
    ) {
        Text(
            text = slots,
            style = MaterialTheme.typography.bodySmall,
            modifier = modifier.padding(8.dp)
        )
    }
}