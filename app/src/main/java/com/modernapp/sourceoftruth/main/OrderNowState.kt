package com.modernapp.sourceoftruth.main


import android.content.res.Resources
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import kotlinx.coroutines.CoroutineScope

@Composable
fun rememberAppState(
    navController: NavHostController = rememberNavController(),
    resources: Resources = resources(),
    coroutineScope: CoroutineScope = rememberCoroutineScope()
) = remember(
    navController,
    resources,
    coroutineScope
) {
    OrderNowState(navController, resources, coroutineScope)
}

class OrderNowState(

    val navController: NavHostController,
    private val resources: Resources,
    coroutineScope: CoroutineScope
)
