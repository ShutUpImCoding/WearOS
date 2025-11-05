package com.example.mykotlinwearos.presentation.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.wear.compose.material.MaterialTheme

@Composable
fun MyKotlinWearOSTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colors = if (darkTheme) darkThemeColors else lightThemeColors

    CompositionLocalProvider(LocalCustomColors provides colors) {
        MaterialTheme(
            content = content
        )
    }
}