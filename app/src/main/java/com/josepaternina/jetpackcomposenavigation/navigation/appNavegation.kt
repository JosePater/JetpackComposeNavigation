package com.josepaternina.jetpackcomposenavigation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.josepaternina.jetpackcomposenavigation.screens.FirstScreen
import com.josepaternina.jetpackcomposenavigation.screens.SecondScreen

// Controla la navegación entre pantallas
@Composable
fun AppNavigation() {
    val navController = rememberNavController()

    // Home: FirstScreen
    NavHost(navController = navController, startDestination = AppScreens.FirstScreen.route) {
        composable(route = AppScreens.FirstScreen.route) {
            FirstScreen(navController)
        }

        // SecondScreen
        composable(route = AppScreens.SecondScreen.route) {
            SecondScreen(navController)
        }
    }

}
