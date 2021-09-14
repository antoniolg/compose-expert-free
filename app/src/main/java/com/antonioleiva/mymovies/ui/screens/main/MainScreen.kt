package com.antonioleiva.mymovies.ui.screens.main

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import com.antonioleiva.mymovies.ui.MyMoviesApp

@ExperimentalFoundationApi
@Composable
fun MainScreen(onNavigate: (Int) -> Unit) {
    MyMoviesApp {
        Scaffold(
            topBar = { MainAppBar() }
        ) { padding ->
            MediaList(
                onClick = { onNavigate(it.id) },
                modifier = Modifier.padding(padding)
            )
        }

    }
}