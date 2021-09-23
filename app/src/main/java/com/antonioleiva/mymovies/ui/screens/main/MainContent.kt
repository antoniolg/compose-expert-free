package com.antonioleiva.mymovies.ui.screens.main

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@ExperimentalFoundationApi
@Composable
fun MainContent(onNavigate: (Int) -> Unit, modifier: Modifier = Modifier) {
    MediaList(
        onClick = { onNavigate(it.id) },
        modifier = modifier
    )
}