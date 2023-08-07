package com.example.jetx.navigation.project_graph

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import com.example.jetx.navigation.ProjectGraph
import com.example.jetx.navigation.ProjectGraph.PROJECT_GRAPH
import com.example.jetx.projects.ProjectListScreen

import com.example.jetx.projects.big_cart.view.screen.splash.BigCartSplashScreen
import com.example.jetx.projects.hulu.navigation.huluNavGraph
import com.example.jetx.projects.hulu.view.screen.HuluHomeScreen

fun NavGraphBuilder.projectNavGraph(navController: NavController) {
    navigation(startDestination = ProjectRoute.ProjectListRoute.route, route = PROJECT_GRAPH) {

        composable(ProjectRoute.ProjectListRoute.route) {
            ProjectListScreen(navController)
        }

        composable(ProjectRoute.BigCartRoute.route) {
            BigCartSplashScreen()
        }


    }
}