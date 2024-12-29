package com.modernapp.sourceoftruth.ui.features.cart

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import com.modernapp.sourceoftruth.ui.theme.SourceOfTruthTheme

@Composable
fun CartScreen(navController: NavHostController) {

    SourceOfTruthTheme  {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            Text(text = "Cart Screen")
        }
    }

}
