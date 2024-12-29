package com.modernapp.sourceoftruth.ui.patterns

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.modernapp.sourceoftruth.common.navigation.*
import com.modernapp.sourceoftruth.main.OrderNowState
import com.modernapp.sourceoftruth.ui.features.cart.CartScreen
import com.modernapp.sourceoftruth.ui.features.home.HomeScreen
import com.modernapp.sourceoftruth.ui.features.productdetail.ProductDetailScreen
import com.modernapp.sourceoftruth.ui.features.productlist.ProductListScreen

@Composable
fun OrderNowNavHost(appState: OrderNowState, paddingValues: PaddingValues) {
    NavHost(
        navController = appState.navController,
        startDestination = OrderNowScreenRoute.Home.route,
        modifier = Modifier.padding(paddingValues = paddingValues)
    ) {
        appSoGraph(appState)
    }
}

fun NavGraphBuilder.appSoGraph(appState: OrderNowState) {

    composable(NavigationBarSection.Home.route) {
        HomeScreen(appState.navController)
    }


    composable(NavigationBarSection.Cart.route) {
        CartScreen(appState.navController)
    }


    composable(OrderNowScreenRoute.ProductList.route) {
        ProductListScreen()
    }


    composable(OrderNowScreenRoute.ProductDetail.route) {
        ProductDetailScreen()
    }
}
