package com.antonioleiva.mymovies.ui.navigation

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import androidx.navigation.NavBackStackEntry
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.antonioleiva.mymovies.ui.screens.detail.DetailScreen
import com.antonioleiva.mymovies.ui.screens.main.MainDetailScreen
import com.antonioleiva.mymovies.ui.screens.main.MainScreen

@ExperimentalFoundationApi
@Composable
fun Navigation() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = NavItem.MainNavItem.route
    ) {
        composable(NavItem.MainNavItem) {
            BoxWithConstraints {
                when {
                    maxWidth <= 600.dp -> {
                        MainScreen(onNavigate = {
                            navController.navigate(NavItem.DetailNavItem.createRoute(it))
                        })
                    }

                    else -> {
                        MainDetailScreen()
                    }
                }
            }
        }
        composable(NavItem.DetailNavItem) { backStackEntry ->
            DetailScreen(
                mediaId = backStackEntry.findArg(NavArgs.MediaId.key),
                onUpClick = { navController.popBackStack() }
            )
        }
    }
}

private fun NavGraphBuilder.composable(
    navItem: NavItem,
    content: @Composable (NavBackStackEntry) -> Unit
) {
    composable(
        route = navItem.route,
        arguments = navItem.args
    ) {
        content(it)
    }
}

private inline fun <reified T> NavBackStackEntry.findArg(key: String): T {
    val value = arguments?.get(key)
    requireNotNull(value)
    return value as T
}