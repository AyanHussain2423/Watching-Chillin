package com.example.watchingchill.ui.data

data class DiscoverScreenState(
    val featureMovies: List<FeatureMoviesState> = FeatureMoviesData,
    val upcomingMovies: List<ComingSoonState> = Comingsoonlist,
    val watchingMovies : List<ComingSoonState> = Watchinglist,
    val StreamingMovies : List<ComingSoonState> = StreamingMovieslist,
)