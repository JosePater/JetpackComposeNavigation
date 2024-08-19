package com.josepaternina.jetpackcomposenavigation.navigation

sealed class AppScreens(val route: String) {
    // Se determinan las pantallas
    object FirstScreen : AppScreens("first_screen")
    object SecondScreen : AppScreens("second_screen")
}