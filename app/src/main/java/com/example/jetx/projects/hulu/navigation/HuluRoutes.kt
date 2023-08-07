package com.example.jetx.projects.hulu.navigation


sealed class HuluRoute(val route: String) {
    object HuluSplashScreen : HuluRoute(HuluGraphConstant.SplashScreen)
    object HuluHomeScreen : HuluRoute(HuluGraphConstant.HomeScreen)
}