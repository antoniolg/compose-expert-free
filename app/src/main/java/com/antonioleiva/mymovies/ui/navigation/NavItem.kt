package com.antonioleiva.mymovies.ui.navigation

import androidx.navigation.NavType
import androidx.navigation.navArgument

sealed class NavItem(
    internal val baseRoute: String,
    private val navArgs: List<NavArgs> = emptyList()
) {
    object MainNavItem : NavItem("main")
    object DetailNavItem : NavItem("detail", listOf(NavArgs.MediaId)) {
        fun createRoute(mediaId: Int) = "$baseRoute/$mediaId"
    }

    val route = run {
        val argValues = navArgs.map { "{${it.key}}" }
        listOf(baseRoute)
            .plus(argValues)
            .joinToString("/")
    }

    val args = navArgs.map {
        navArgument(it.key) { type = it.navType }
    }

}

enum class NavArgs(val key: String, val navType: NavType<*>) {
    MediaId("mediaId", NavType.IntType)
}