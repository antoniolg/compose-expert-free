package com.antonioleiva.mymovies.ui.screens.main

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import com.antonioleiva.mymovies.R
import com.antonioleiva.mymovies.ui.MyMoviesApp

@ExperimentalFoundationApi
@Composable
fun MainScreen(onNavigate: (Int) -> Unit) {
    MyMoviesApp {
        Scaffold(
            topBar = { MainAppBar(stringResource(id = R.string.app_name)) }
        ) { padding ->
            MainContent(onNavigate = onNavigate, Modifier.padding(padding))
        }

    }
}