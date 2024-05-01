package com.asr.bookstore

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.FabPosition
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController

@Composable
fun MainLayout(navController: NavHostController, content: @Composable (PaddingValues) -> Unit) {
    Scaffold(
        floatingActionButton = {
            FloatingActionButton(
                onClick = { /** navController.navTo(...) **/ },
            ) {
                Icon(Icons.Filled.ShoppingCart, "Cart")
            }
        },
        floatingActionButtonPosition = FabPosition.End,
        bottomBar = { MyBottomAppBar(navController) },
        content = content
    )
}
