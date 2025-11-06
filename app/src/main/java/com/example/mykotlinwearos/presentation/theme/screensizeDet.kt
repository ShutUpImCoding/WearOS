package com.example.mykotlinwearos.presentation.theme

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

// SCREEN SIZE DETECTOR

data class WearScreenConfig(
    val isRound: Boolean,
    val isSmall: Boolean, // < 200dp
    val screenWidth: Dp,
    val screenHeight: Dp,
    val horizontalPadding: Dp,
    val verticalPadding: Dp,
    val contentPadding: Dp
)

@Composable
fun rememberWearScreenConfig(): WearScreenConfig {
    val configuration = LocalConfiguration.current
    val screenWidth = configuration.screenWidthDp.dp
    val screenHeight = configuration.screenHeightDp.dp

    return remember(screenWidth, screenHeight) {
        val isRound = kotlin.math.abs(screenWidth.value - screenHeight.value) < 10
        val isSmall = screenWidth < 200.dp

        WearScreenConfig(
            isRound = isRound,
            isSmall = isSmall,
            screenWidth = screenWidth,
            screenHeight = screenHeight,
            horizontalPadding = when {
                isRound && isSmall -> 16.dp
                isRound -> 24.dp
                isSmall -> 12.dp
                else -> 16.dp
            },
            verticalPadding = when {
                isSmall -> 8.dp
                isRound -> 24.dp
                else -> 12.dp
            },
            contentPadding = if (isSmall) 8.dp else 12.dp
        )
    }
}