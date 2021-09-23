package com.antonioleiva.mymovies.ui.screens.detail

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import com.antonioleiva.mymovies.R
import com.antonioleiva.mymovies.model.getMedia
import com.antonioleiva.mymovies.ui.screens.shared.ArrowBackIcon

@Composable
fun DetailScreen(mediaId: Int, onUpClick: () -> Unit) {
    val mediaItem = remember { getMedia().first { it.id == mediaId } }

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(text = mediaItem.title) },
                navigationIcon = { ArrowBackIcon(onUpClick) }
            )
        }
    ) { padding ->
        DetailContent(
            mediaItem = mediaItem,
            modifier = Modifier
                .padding(padding)
                .fillMaxWidth()
                .height(dimensionResource(R.dimen.cell_thumb_height))
        )
    }
}