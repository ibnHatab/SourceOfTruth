package com.modernapp.sourceoftruth.common.navigation

sealed class OrderNowScreenRoute(val route: String) {
    data object Home : OrderNowScreenRoute("home")
    data object Cart : OrderNowScreenRoute("cart")
    data object ProductList : OrderNowScreenRoute("product_list")
    data object ProductDetail : OrderNowScreenRoute("product_detail")
}