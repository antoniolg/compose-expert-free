package com.antonioleiva.mymovies.ui.screens.main

import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Share
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.antonioleiva.mymovies.R
import com.antonioleiva.mymovies.ui.MyMoviesApp

@Composable
fun MainAppBar() {
    TopAppBar(
        title = { Text(stringResource(id = R.string.app_name)) },
        actions = {
            AppBarAction(
                imageVector = Icons.Default.Search,
                onClick = { /* TODO */ }
            )
            AppBarAction(
                imageVector = Icons.Default.Share,
                onClick = { /* TODO */ }
            )
        }
    )
}

@Composable
private fun AppBarAction(
    imageVector: ImageVector,
    onClick: () -> Unit
) {
    IconButton(onClick = onClick) {
        Icon(
            imageVector = imageVector,
            contentDescription = null
        )
    }
}

@Preview
@Composable
fun AppBarActionPreview() {
    MyMoviesApp {
        MainAppBar()
    }
}