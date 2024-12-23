package com.example.watchingchill.ui.component.sections

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.watchingchill.ui.component.MovieThumbnail
import com.example.watchingchill.ui.component.SectionHeader
import com.example.watchingchill.ui.data.ComingSoonState

@OptIn(ExperimentalLayoutApi::class)
@Composable
fun CominhSoonSection(
    modifier: Modifier = Modifier,
    data: List<ComingSoonState>
) {
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.spacedBy(4.dp)
        ) {
        SectionHeader(text = "Coming Soon")
        Spacer(modifier = Modifier.height(4.dp))
        FlowRow(
            modifier = Modifier.fillMaxWidth(),
            maxItemsInEachRow = 2,
            verticalArrangement = Arrangement.spacedBy(8.dp),
            horizontalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            data.onEach { thumbnail ->
                MovieThumbnail(
                    img = thumbnail.img,
                    modifier = Modifier.weight(weight = 1f)
                )
            }
        }
    }
}