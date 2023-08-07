package com.example.jetx.projects

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.jetx.R
import com.example.jetx.navigation.project_graph.ProjectRoute
import com.example.jetx.utils.getNavController
import com.example.jetx.projects.big_cart.view.custom_view.SpaceHeight
import com.example.jetx.projects.data.LocalData

@Composable
fun ProjectListScreen(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(start = 20.dp, end = 20.dp, top = 20.dp)
    ) {

        Text(
            text = "Full Apps",
            style = TextStyle(color = Color.Gray, fontSize = 20.sp, fontWeight = FontWeight.W600)
        )

        projectGridView(navController)
    }
}

@Composable
fun projectGridView(navController: NavController) {
    val projectList = LocalData.getProjectList()
    LazyVerticalGrid(columns = GridCells.Fixed(2)) {
        items(projectList.size) {
            Card(
                modifier = Modifier
                    .clickable {
                        onItemClicked(navController, projectList[it].title)
                    }
                    .height(150.dp)
                    .padding(5.dp),
                elevation = CardDefaults.elevatedCardElevation(defaultElevation = 3.dp)
            ) {
                Column(
                    modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.ic_shop),
                        contentDescription = "Icon",
                        modifier = Modifier
                            .width(30.dp)
                            .height(30.dp)
                    )
                    SpaceHeight(height = 10.dp)
                    Text(text = projectList[it].title)
                }

            }

        }
    }
}

fun onItemClicked(navController: NavController, title: String) {
    when (title) {
        "Big Cart" -> navController.navigate(ProjectRoute.BigCartRoute.route)
        "Hulu" -> navController.navigate(ProjectRoute.HuluAppRoute.route)
    }

}


@Composable
@Preview(showBackground = true)
fun ProjectListScreenPreview() {
    ProjectListScreen(getNavController())
}
