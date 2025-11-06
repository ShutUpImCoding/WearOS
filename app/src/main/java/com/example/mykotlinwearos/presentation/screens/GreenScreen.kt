package com.example.mykotlinwearos.presentation.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.mykotlinwearos.presentation.theme.AppTypography
import com.example.mykotlinwearos.presentation.theme.CustomThemeHelper

@Composable
fun GreenScreen(navController: NavController) {
    val colors = CustomThemeHelper.colors

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(colors.background),
        contentAlignment = Alignment.Center
    ) {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {

            Text("Header", style = AppTypography.header, color = colors.textPrimary)
            Text("Title", style = AppTypography.title, color = colors.textPrimary)
            Text("Body", style = AppTypography.body, color = colors.textPrimary)

            Text("92", style = AppTypography.body, color = colors.textPrimary)
            Text("88", style = AppTypography.numberNormal, color = colors.textPrimary)
            Text("88", style = AppTypography.numberLarge, color = colors.textPrimary)

            Spacer(Modifier.height(16.dp))

            Button(onClick = { navController.popBackStack() },
                    colors = ButtonDefaults.buttonColors(backgroundColor = colors.iconAcceptBg)
                ) {
                Text("Back")
            }
        }
    }
}
