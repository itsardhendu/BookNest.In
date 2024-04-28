package com.asr.bookstore

sealed class ScreenRoutes(val routes: String) {
    object HomeScreen : ScreenRoutes("HomeScreen")
    object Account : ScreenRoutes("Account")
    object Notifications : ScreenRoutes("Notifications")
    object Menu : ScreenRoutes("Menu")
}