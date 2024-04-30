package com.asr.bookstore

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.asr.bookstore.Screens.AccountScreen
import com.asr.bookstore.Screens.HomeScreen
import com.asr.bookstore.Screens.MenuScreen
import com.asr.bookstore.Screens.NotificationsScreen


@Composable
fun AppNavigation() {
    val navController = rememberNavController()

    MainLayout(navController) { paddingValues ->
        NavHost(navController = navController, startDestination = ScreenRoutes.HOME) {
            composable(ScreenRoutes.HOME) { HomeScreen(navController) }
            composable(ScreenRoutes.ACCOUNT) { AccountScreen(navController) }
            composable(ScreenRoutes.NOTIFICATIONS) { NotificationsScreen(navController) }
            composable(ScreenRoutes.MENU) { MenuScreen(navController) }
        }
    }
}

