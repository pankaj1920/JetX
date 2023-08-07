package com.example.jetx.projects.adventure.view.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetx.R

@Composable
fun AdventureOnboardingScreen() {
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.BottomCenter) {

        Image(
            painter = painterResource(id = R.drawable.img_adventure_onboarding),
            contentDescription = "",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.TopCenter)
        )

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .height(400.dp)
                .background(
                    Color.White,
                    shape = RoundedCornerShape(topEnd = 40.dp, topStart = 40.dp)
                ),
        ) {
            Text(
                text = "Nature Adventure\nis waiting for you",
                fontSize = 28.sp,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 40.dp)
            )

            Text(
                text = "You are incredible, so, we have a\nfantastic trip list just for you. you never\nknew about this trip list.",
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 20.dp),
                textAlign = TextAlign.Center,
                color = Color(0xff0D0D0D),
                fontSize = 16.sp
            )
            Column(
                modifier = Modifier
                    .fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {

                Image(
                    imageVector = ImageVector.vectorResource(id = R.drawable.ic_adv_next_icon),
                    contentDescription = "Next Button",
                    modifier = Modifier
                        .width(100.dp)
                        .height(100.dp)
                )

            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun AdventureOnboardingScreenPreview() {
    AdventureOnboardingScreen()
}