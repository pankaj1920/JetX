package com.example.jetx.projects.big_cart.view.custom_view

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Composable
fun GradientButton() {
    val buttonGreenGradient =
        Brush.horizontalGradient(listOf(Color(0xFFAEDC81), Color(0xFF6CC51D)))

    Button(modifier = Modifier
        .fillMaxWidth()
        .height(60.dp),
        colors = ButtonDefaults.buttonColors(backgroundColor = Color.Transparent),
        contentPadding = PaddingValues(),
        shape = RoundedCornerShape(5.dp),
        onClick = { }) {
        Box(
            modifier = Modifier
                .background(buttonGreenGradient)
                .fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            Text(text = "Get Started")
        }
    }
}


@Preview(showBackground = true)
@Composable
fun CustomButtonPreview() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp)
    ) {
        GradientButton()
    }

}