package com.example.mykotlinwearos.presentation.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.mykotlinwearos.presentation.theme.CustomThemeHelper

@Composable
fun BlueScreen(navController: NavController) {
    val colors = CustomThemeHelper.colors
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(colors.background),
        contentAlignment = Alignment.Center
    ) {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Text("Blue Screen", color = colors.textPrimary)
            Spacer(Modifier.height(16.dp))
            Button(onClick = { navController.popBackStack() },
                colors = ButtonDefaults.buttonColors(backgroundColor = colors.buttonMain)
            ) {
                Text("Back", color = colors.textBlack)
            }
        }
    }
}
