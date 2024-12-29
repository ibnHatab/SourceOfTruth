package com.modernapp.sourceoftruth.ui.patterns

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.compose.rememberNavController
import com.modernapp.sourceoftruth.ui.features.home.HomeScreen

import androidx.navigation.compose.composable

import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.currentBackStackEntryAsState
import com.modernapp.sourceoftruth.common.navigation.NavigationBarSection
import com.modernapp.sourceoftruth.common.navigation.OrderNowScreenRoute
import com.modernapp.sourceoftruth.main.OrderNowState
import com.modernapp.sourceoftruth.ui.features.cart.CartScreen

@Composable
fun OrderNowBottomBar(appState: OrderNowState) {
    val navController: NavHostController = appState.navController
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentDestination = navBackStackEntry?.destination
    Scaffold(
        modifier = Modifier.fillMaxSize(),
        bottomBar = {
            NavigationBar {
                NavigationBarSection.sections.forEach { section ->
                    NavigationBarItem(
                        selected = currentDestination?.hierarchy?.any {
                            it.route == section.route
                        } == true,

                        label = {
                            Text(section.title)
                        },
                        icon = {
                            Icon(
                                section.icon,
                                contentDescription = section.title
                            )
                        },
                        onClick = {
                            navController.navigate(section.route) {
                                popUpTo(navController.graph.findStartDestination().id) {
                                    saveState = true
                                }
                                launchSingleTop = true
                                restoreState = true
                            }
                        }
                    )
                }
            }
        }
    ) {paddingValues ->
        OrderNowNavHost(appState, paddingValues)
    }
}
