package com.asr.bookstore.Screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AccountScreen(navController: NavController) {
    Scaffold(
        topBar = {
            TopAppBar(
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primaryContainer,
                    titleContentColor = MaterialTheme.colorScheme.primary,
                ),
                title = {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(end = 16.dp),
                        horizontalArrangement = Arrangement.Absolute.Left

                    ) {
                        Text("Your Account")
                    }
                }
            )
        },
    ) { innerPadding ->
        Row(
            modifier = Modifier
                .padding(innerPadding)
                .fillMaxWidth(), // Ensure the Row uses full width
            horizontalArrangement = Arrangement.SpaceAround, // Distribute space around elements
        ) {
            Column(modifier = Modifier.padding(8.dp)) {
                FilledTonalButton(
                    onClick = { /*TODO*/ },
                    modifier = Modifier
                        .padding(top = 8.dp)
                        .width(150.dp)
                        .height(50.dp)
                ) {
                    Text("Your Orders")
                }
                FilledTonalButton(
                    onClick = { /*TODO*/ },
                    modifier = Modifier
                        .padding(top = 8.dp)
                        .width(150.dp)
                        .height(50.dp)
                ) {
                    Text("Your Account")
                }
            }
            Column(modifier = Modifier.padding(8.dp)) {
                FilledTonalButton(
                    onClick = { /*TODO*/ },
                    modifier = Modifier
                        .padding(top = 8.dp)
                        .width(150.dp)
                        .height(50.dp)
                ) {
                    Text("Buy Again")
                }
                FilledTonalButton(
                    onClick = { /*TODO*/ },
                    modifier = Modifier
                        .padding(top = 8.dp)
                        .width(150.dp)
                        .height(50.dp)
                ) {
                    Text("Wish Lists")
                }
            }
        }

    }
}