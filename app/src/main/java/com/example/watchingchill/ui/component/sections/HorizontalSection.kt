package com.example.watchingchill.ui.component.sections

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.PageSize
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.rememberScrollState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.unit.Density
import androidx.compose.ui.unit.dp
import com.example.watchingchill.ui.component.MovieThumbnail
import com.example.watchingchill.ui.component.SectionHeader
import com.example.watchingchill.ui.data.ComingSoonState

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun HorizontalSection (
    modifier: Modifier = Modifier,
    data: List<ComingSoonState>,
    name: String
){
    val pageState = rememberPagerState(pageCount = {data.size})
    Column(
        modifier = Modifier,
    ) {
        SectionHeader(
            text = name,
            modifier = modifier
            )
        HorizontalPager(
            state = pageState,
            pageSize = TwopagesperView,
            pageSpacing = 18.dp,
            contentPadding = PaddingValues(horizontal = 8.dp)
        ) {
            pageIndex ->
            MovieThumbnail(
                img = data[pageIndex].img,
                modifier = modifier.fillMaxWidth()
            )
        }
    }
}
@OptIn(ExperimentalFoundationApi::class)
private val TwopagesperView = object : PageSize{
    override fun Density.calculateMainAxisPageSize(availableSpace: Int, pageSpacing: Int): Int =
        (availableSpace - pageSpacing) / 2
}