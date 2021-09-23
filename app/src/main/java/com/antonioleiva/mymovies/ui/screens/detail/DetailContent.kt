package com.antonioleiva.mymovies.ui.screens.detail

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.antonioleiva.mymovies.model.MediaItem
import com.antonioleiva.mymovies.ui.screens.shared.Thumb

@Composable
fun DetailContent(mediaItem: MediaItem, modifier: Modifier = Modifier) {
    Thumb(mediaItem = mediaItem, modifier)
}