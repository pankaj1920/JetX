package com.example.jetx.utils

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.Button
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.jetx.projects.hulu.view.screen.HuluHomeScreen
import com.example.jetx.ui.theme.bottomBarColor
import com.example.jetx.ui.theme.statusBarColor
import com.google.accompanist.systemuicontroller.rememberSystemUiController

@Composable
fun changeSystemUiColor(statusColour:Color = statusBarColor,bottomBarColour:Color=bottomBarColor,darkTheme: Boolean = isSystemInDarkTheme()) {
    val systemUiController = rememberSystemUiController()
    if (darkTheme) {
        systemUiController.setSystemBarsColor(color = statusColour, darkIcons = false)
        systemUiController.setNavigationBarColor(color = bottomBarColour, darkIcons = false)
    } else {
        systemUiController.setSystemBarsColor(color = statusColour, darkIcons = false)
        systemUiController.setNavigationBarColor(color = bottomBarColour, darkIcons = false)
    }

    Button(onClick = { /*TODO*/ }) {
        
    }


}

