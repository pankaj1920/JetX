package com.example.jetx.navigation.root_graph

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.example.jetx.navigation.ProjectGraph
import com.example.jetx.navigation.ProjectGraph.PROJECT_GRAPH
import com.example.jetx.navigation.ProjectGraph.ROOT_GRAPH
import com.example.jetx.navigation.project_graph.projectNavGraph
import com.example.jetx.projects.hulu.navigation.huluNavGraph

@Composable
fun RootNavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
//        startDestination = PROJECT_GRAPH,
        startDestination = ProjectGraph.HULU_GRAPH,
        route = ROOT_GRAPH
    ) {
        projectNavGraph(navController)
        huluNavGraph(navController)
    }
}