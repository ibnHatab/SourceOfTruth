package com.modernapp.sourceoftruth.common.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.ui.graphics.vector.ImageVector

sealed class NavigationBarSection(
    val title: String = "",
    val icon: ImageVector,
    val route: String = ""
) {
    companion object {
        val sections = listOf(
            Home,
            Cart

        )
    }

    data object Home : NavigationBarSection(
        title = "Home",
        icon = Icons.Default.Home,
        route = OrderNowScreenRoute.Home.route,
    )

    data object Cart : NavigationBarSection(
        title = "Cart",
        icon = Icons.Default.ShoppingCart,
        route = OrderNowScreenRoute.Cart.route
    )


}