package com.example.mykotlinwearos.presentation.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun MainScreen(navController: NavController) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black),
        contentAlignment = Alignment.Center
    ) {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Text("Main Screen", color = Color.White)
            Spacer(Modifier.height(16.dp))
            Button(onClick = { navController.navigate("blue") }) {
                Text("Go to Blue Screen")
            }
            Spacer(Modifier.height(16.dp))
            Button(onClick = { navController.navigate("green") }) {
                Text("Go to Green Screen")
            }
        }
    }
}
