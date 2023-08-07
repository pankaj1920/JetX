package com.example.jetx

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController
import com.example.jetx.navigation.root_graph.RootNavGraph
import com.example.jetx.ui.theme.JetXTheme
import com.example.jetx.ui.theme.huluBgColor
import com.example.jetx.utils.changeSystemUiColor

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetXTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {

                    SetupNavigation()
                }
            }
        }
    }
}

@Composable
fun SetupNavigation() {
    val navHostController = rememberNavController()
    RootNavGraph(navController = navHostController)
}