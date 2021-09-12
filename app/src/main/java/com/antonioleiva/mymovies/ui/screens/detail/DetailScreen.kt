package com.antonioleiva.mymovies.ui.screens.detail

import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import com.antonioleiva.mymovies.model.getMedia
import com.antonioleiva.mymovies.ui.screens.shared.Thumb

@Composable
fun DetailScreen(mediaId: Int) {
    val mediaItem = remember { getMedia().first { it.id == mediaId } }

    Scaffold(
        topBar = { TopAppBar(title = { Text(text = mediaItem.title) }) }
    ) {
        Thumb(mediaItem = mediaItem)
    }
}