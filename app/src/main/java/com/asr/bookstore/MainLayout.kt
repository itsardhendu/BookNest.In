package com.asr.bookstore

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController

@Composable
fun MainLayout(navController: NavHostController, content: @Composable (PaddingValues) -> Unit) {
    Scaffold(
        bottomBar = { MyBottomAppBar(navController) },
        content = content
    )
}
