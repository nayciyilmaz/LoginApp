package com.example.loginapplication.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.loginapplication.screens.MainScreen
import com.example.loginapplication.screens.StartScreen

@Composable
fun LoginNavigation() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = LoginAppScreens.StartScreen.route) {
        composable(route = LoginAppScreens.StartScreen.route) {
            StartScreen(navController = navController)
        }
        composable(route = LoginAppScreens.MainScreen.route) {
            MainScreen(navController = navController)
        }
        composable(route = LoginAppScreens.SignInScreen.route) {

        }
        composable(route = LoginAppScreens.SignUpScreen.route) {

        }
        composable(route = LoginAppScreens.HomePageScreen.route) {

        }
    }
}