package com.example.watchingchill.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.core.provider.FontsContractCompat.Columns
import com.example.watchingchill.ui.component.sections.CominhSoonSection
import com.example.watchingchill.ui.component.sections.FeatureMoviesSection
import com.example.watchingchill.ui.component.sections.HorizontalSection
import com.example.watchingchill.ui.data.DiscoverScreenState

@Composable
fun DiscoverScreen(
    modifier: Modifier = Modifier,
    screenState: DiscoverScreenState
){
    val scrollstate = rememberScrollState()
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(18.dp)
            .verticalScroll(scrollstate)
    ){
        FeatureMoviesSection(
            data = screenState.featureMovies
        )
        Spacer(modifier = modifier.height(4.dp))
        CominhSoonSection(
            data = screenState.upcomingMovies
        )
        HorizontalSection(
            modifier = modifier,
            data = screenState.watchingMovies,
            name = "Currently Watching"
        )
        HorizontalSection(
            modifier = modifier,
            data = screenState.StreamingMovies,
            name = "Streaming Now"
        )
    }

}