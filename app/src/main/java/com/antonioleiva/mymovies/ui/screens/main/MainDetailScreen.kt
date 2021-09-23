package com.antonioleiva.mymovies.ui.screens.main

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import com.antonioleiva.mymovies.model.getMedia
import com.antonioleiva.mymovies.ui.MyMoviesApp
import com.antonioleiva.mymovies.ui.screens.detail.DetailContent

@ExperimentalFoundationApi
@Composable
fun MainDetailScreen() {
    var currentId by remember { mutableStateOf(1) }
    val mediaItem = getMedia().first { it.id == currentId }

    MyMoviesApp {
        Scaffold(
            topBar = { MainAppBar(mediaItem.title) }
        ) { padding ->
            Row(
                modifier = Modifier.padding(padding)
            ) {
                MainContent(
                    onNavigate = { currentId = it },
                    modifier = Modifier.weight(1f)
                )
                DetailContent(
                    mediaItem = mediaItem,
                    modifier = Modifier
                        .weight(2f)
                        .fillMaxHeight()
                )
            }
        }

    }
}