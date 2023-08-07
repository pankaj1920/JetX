package com.example.jetx.projects.hulu.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.example.jetx.navigation.ProjectGraph.HULU_GRAPH
import com.example.jetx.projects.hulu.view.screen.HuluHomeScreen
import com.example.jetx.projects.hulu.view.screen.HuluSplashScreen

fun NavGraphBuilder.huluNavGraph(navController: NavController) {
    navigation(startDestination = HuluRoute.HuluHomeScreen.route, route = HULU_GRAPH) {
        composable(HuluRoute.HuluSplashScreen.route) {
            HuluSplashScreen(navController)
        }

        composable(HuluRoute.HuluHomeScreen.route) {
            HuluHomeScreen()
        }

    }
}