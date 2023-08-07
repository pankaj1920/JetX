package com.example.jetx.projects.hulu.view.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetx.R
import com.example.jetx.projects.big_cart.view.custom_view.SpaceHeight
import com.example.jetx.projects.big_cart.view.custom_view.SpaceWidth
import com.example.jetx.projects.hulu.data.HuluLocalData
import com.example.jetx.projects.hulu.model.HuluCategoriesModel
import com.example.jetx.projects.hulu.model.HuluContinueWatchingModel
import com.example.jetx.ui.theme.huluBgColor
import com.example.jetx.ui.theme.huluBgGreen
import com.example.jetx.ui.theme.huluRedColor
import com.example.jetx.ui.theme.huluTextGreyColor
import com.example.jetx.ui.theme.huluWhiteColor
import com.example.jetx.utils.changeSystemUiColor

@Composable
fun HuluHomeScreen() {
    changeSystemUiColor(statusColour = huluBgColor, bottomBarColour = huluBgColor)
    var categoriesSelected by remember { mutableStateOf(0) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(huluBgColor)
    ) {
        Image(
            imageVector = ImageVector.vectorResource(R.drawable.hulu),
            contentDescription = "Hulu",
            modifier = Modifier.padding(horizontal = 20.dp, vertical = 20.dp)
        )

        LazyRow(modifier = Modifier.padding(horizontal = 20.dp)) {

            items(HuluLocalData.getCategoriesList(), key = { it.id }) {
                HuluCategoriesItem(categoryData = it, selected = categoriesSelected == it.id) {
                    categoriesSelected = it
                }
                SpaceWidth(width = 10.dp)
            }
        }
        LazyColumn {
            item {
                HuluContent()
            }
        }

    }
}

@Composable
fun HuluContent() {
    Image(
        painter = painterResource(id = R.drawable.hulu_banner),
        contentDescription = "",
        modifier = Modifier
            .fillMaxWidth()
            .height(250.dp)
            .padding(top = 20.dp),
        contentScale = ContentScale.FillBounds
    )

    Text(
        text = "Continue Watching",
        modifier = Modifier.padding(top = 20.dp, start = 20.dp),
        style = TextStyle(
            color = huluWhiteColor, fontSize = 18.sp, fontWeight = FontWeight.W800
        )
    )

    SpaceHeight(height = 15.dp)

    LazyRow(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 20.dp)
    ) {
        items(HuluLocalData.getContinueWatching()) {
            HuluContinueWatching(data = it)
            SpaceWidth(width = 10.dp)
        }
    }

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 20.dp, vertical = 30.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = "Suggested for you",
            style = TextStyle(
                color = huluWhiteColor, fontSize = 18.sp, fontWeight = FontWeight.W800
            )
        )

        Text(text = "See all", color = huluBgGreen)
    }

    LazyRow(modifier = Modifier.padding(start = 20.dp)) {
        items(HuluLocalData.getSuggestedMovie()) {
            Image(
                painter = painterResource(id = it.image),
                contentDescription = "",
                contentScale = ContentScale.FillBounds,
                modifier = Modifier
                    .width(101.dp)
                    .height(157.dp))
            SpaceWidth(width = 15.dp)
        }
    }

}

@Composable
private fun HuluCategoriesItem(
    categoryData: HuluCategoriesModel, selected: Boolean, onItemClick: (position: Int) -> Unit
) {
    Column(
        modifier = Modifier.clickable { onItemClick(categoryData.id) },
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = categoryData.title, style = TextStyle(
                color = if (selected) huluWhiteColor else huluTextGreyColor,
                fontWeight = if (selected) FontWeight.W900 else FontWeight.Normal,
                fontSize = 14.sp
            )
        )

        if (selected) {
            SpaceHeight(height = 8.dp)
            Box(
                modifier = Modifier
                    .background(huluBgGreen)
                    .height(3.dp)
                    .width(30.dp)
            )
        }


    }
}

@Composable
private fun HuluContinueWatching(data: HuluContinueWatchingModel) {
    Column(
        modifier = Modifier.width(200.dp),
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(120.dp),
        ) {
            Image(
                painter = painterResource(id = data.image),
                contentDescription = data.title,
                contentScale = ContentScale.FillBounds,
                modifier = Modifier.fillMaxSize()
            )
            LinearProgressIndicator(
                modifier = Modifier
                    .height(5.dp)
                    .fillMaxWidth()
                    .align(Alignment.BottomCenter),
                progress = data.alreadyWatchedProgress,
                trackColor = huluWhiteColor,
                color = huluRedColor
            )
        }
        SpaceHeight(height = 7.dp)
        Text(
            text = data.title,
            style = TextStyle(
                color = huluWhiteColor,
                fontSize = 16.sp,
                fontWeight = FontWeight.W800
            )
        )
        SpaceHeight(height = 3.dp)
        Text(text = data.timeLeft, color = huluTextGreyColor)
    }

}


@Preview(showBackground = true)
@Composable
fun HuluHomePreview() {
    HuluHomeScreen()
}