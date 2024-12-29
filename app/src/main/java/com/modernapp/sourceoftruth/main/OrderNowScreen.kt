package com.modernapp.sourceoftruth.main

import android.content.res.Resources
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.platform.LocalContext
import com.modernapp.sourceoftruth.ui.patterns.OrderNowBottomBar
import com.modernapp.sourceoftruth.ui.patterns.OrderNowTopBar
import com.modernapp.sourceoftruth.ui.theme.SourceOfTruthTheme

@Composable
fun OrderNowScreen() {
    SourceOfTruthTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            val appState = rememberAppState()
            Scaffold(
                topBar = {
                    OrderNowTopBar()
                },
                bottomBar = {
                    OrderNowBottomBar(appState)
                }
            ) { innerPadding ->
                println(innerPadding)
            }
        }
    }

}

@Composable
@ReadOnlyComposable
fun resources(): Resources {
    LocalConfiguration.current
    return LocalContext.current.resources
}
