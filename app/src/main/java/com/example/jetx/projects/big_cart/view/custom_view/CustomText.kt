package com.example.jetx.projects.big_cart.view.custom_view

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.sp
import com.example.jetx.utils.FontType
import com.example.jetx.utils.getPoppinFontType


@Composable
fun TextPoppinRegular(
    modifier: Modifier,
    text:String,
    fontSize:TextUnit,
    textColor:Color
) {
    Text(
        text = text, modifier = modifier,
        style = TextStyle(
            fontWeight = FontWeight.Normal,
            fontSize = fontSize,
            color = textColor,
            fontFamily = getPoppinFontType(FontType.REGULAR)
        )
    )
}

@Composable
fun TextPoppinMedium(
    modifier: Modifier,
    text:String,
    fontSize:TextUnit,
    textColor:Color
) {
    Text(
        text = text, modifier = modifier,
        style = TextStyle(
            fontWeight = FontWeight.W500,
            fontSize = fontSize,
            color = textColor,
            fontFamily = getPoppinFontType(FontType.MEDIUM)
        )
    )
}

@Composable
fun TextPoppinSemiBold(
    modifier: Modifier,
    text:String,
    fontSize:TextUnit,
    textColor:Color
) {
    Text(
        text = text, modifier = modifier,
        style = TextStyle(
            fontWeight = FontWeight.SemiBold,
            fontSize = fontSize,
            color = textColor,
            fontFamily = getPoppinFontType(FontType.SEMI_BOLD)
        )
    )
}

@Composable
fun TextPoppinBold(
    modifier: Modifier,
    text:String,
    fontSize:TextUnit,
    textColor:Color
) {
    Text(
        text = text, modifier = modifier,
        style = TextStyle(
            fontWeight = FontWeight.Bold,
            fontSize = fontSize,
            color = textColor,
            fontFamily = getPoppinFontType(FontType.BOLD)
        )
    )
}




@Preview(showBackground = true)
@Composable
fun CustomTextPreview() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
    }
}