package com.asr.bookstore

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.asr.bookstore.Screens.AccountScreen
import com.asr.bookstore.Screens.HomeScreen

@Composable
fun Navigation() {
    val navController = rememberNavController() // Remember the NavController

    NavHost(
        navController = navController,
        startDestination = ScreenRoutes.HomeScreen.routes
    ) {
        composable(ScreenRoutes.HomeScreen.routes) {
            HomeScreen(navController = navController)
        }
        composable(ScreenRoutes.Account.routes) {
            AccountScreen(navController = navController)
        }
//        composable(ScreenRoutes.Notifications.routes) {
//            ScreenRoutes.Notifications(navController = navController)
//        }
//        composable(ScreenRoutes.Menu.routes) {
//            ScreenRoutes.Menu(id = 0L, viewModel = viewModel, navController = navController)
//        }
    }
}
