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
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.blur
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jetx.R


@Composable
fun AdventureDetailScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(15.dp),
        verticalArrangement = Arrangement.SpaceBetween

    ) {

        Column(
            modifier = Modifier

                .fillMaxWidth()
                .weight(1f)
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(450.dp)
            ) {
                Image(
                    modifier = Modifier.fillMaxSize(),
                    painter = painterResource(id = R.drawable.img_adv_detail),
                    contentDescription = "adv img detail",
                    contentScale = ContentScale.FillBounds
                )

                Box(modifier = Modifier
                    .width(50.dp)
                    .height(50.dp)
                    .blur(10.dp)) {
                    Image(imageVector = ImageVector.vectorResource(id = R.drawable.ic_adv_left), contentDescription = "")

                }



            }
        }

        Column(
            modifier = Modifier
                .background(Color.Yellow)
                .fillMaxWidth()
        ) {
            Text(text = "Dsdf")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun AdventureDetailPreview() {
    AdventureDetailScreen()
}