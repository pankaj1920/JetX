package com.example.jetx.projects.hulu.view.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.jetx.R
import com.example.jetx.projects.hulu.navigation.HuluGraphConstant
import com.example.jetx.ui.theme.huluBgColor
import com.example.jetx.utils.changeSystemUiColor
import com.example.jetx.utils.getNavController
import kotlinx.coroutines.delay
import kotlin.time.Duration.Companion.seconds

@Composable
fun HuluSplashScreen(navController: NavController) {
    changeSystemUiColor(statusColour = huluBgColor, bottomBarColour = huluBgColor)

    LaunchedEffect(key1 = Unit) {
        delay(3.seconds)
        navController.navigate(HuluGraphConstant.HomeScreen)
    }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(huluBgColor),
        contentAlignment = Alignment.Center
    ) {
        Image(
            imageVector = ImageVector.vectorResource(R.drawable.hulu),
            contentDescription = "Hulu",
            modifier = Modifier.size(150.dp)
        )

    }
}

@Preview(showBackground = true)
@Composable
fun HuluSplashPreview() {
    HuluSplashScreen(navController = getNavController())
}