package com.modernapp.sourceoftruth.main

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.modernapp.sourceoftruth.ui.OrderScreen
import com.modernapp.sourceoftruth.ui.theme.SourceOfTruthTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SourceOfTruthTheme {
                Surface(modifier = Modifier.fillMaxSize()) {
                    OrderScreen()
                }
            }
        }
    }
}

