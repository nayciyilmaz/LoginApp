package com.example.loginapplication.navigation

import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.loginapplication.screens.MainScreen
import com.example.loginapplication.screens.SignInScreen
import com.example.loginapplication.screens.SignUpScreen
import com.example.loginapplication.screens.StartScreen
import com.example.loginapplication.viewmodel.LoginViewModel

@Composable
fun LoginNavigation() {
    val navController = rememberNavController()
    val viewModel: LoginViewModel = viewModel()

    NavHost(navController = navController, startDestination = LoginAppScreens.MainScreen.route) {
        composable(route = LoginAppScreens.StartScreen.route) {
            StartScreen(navController = navController)
        }
        composable(route = LoginAppScreens.MainScreen.route) {
            MainScreen(navController = navController)
        }
        composable(route = LoginAppScreens.SignInScreen.route) {
            SignInScreen(
                navController = navController,
                viewModel = viewModel
            )
        }
        composable(route = LoginAppScreens.SignUpScreen.route) {
            SignUpScreen(
                navController = navController,
                viewModel = viewModel
            )
        }
        composable(route = LoginAppScreens.HomePageScreen.route) {

        }
    }
}