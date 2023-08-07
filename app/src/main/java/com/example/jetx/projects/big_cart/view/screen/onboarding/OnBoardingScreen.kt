package com.example.jetx.projects.big_cart.view.screen.onboarding

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import com.example.jetx.utils.getNavController

@Composable
fun OnBoardingScreen(navController: NavController) {

    Column(modifier = Modifier.fillMaxSize()) {
        Column(
            modifier = Modifier
                .weight(5f)
                .fillMaxWidth()
                .background(Color.Red)
        ) {

        }
        Column(
            modifier = Modifier
                .weight(1f)
                .fillMaxWidth()
                .background(Color.Yellow)
        ) {

        }
    }
}

@Preview(showBackground = true)
@Composable
fun OnBoardingScreenPreview() {
    OnBoardingScreen(getNavController())
}