package com.example.mykotlinwearos.presentation.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.wear.compose.foundation.lazy.ScalingLazyColumn
import androidx.wear.compose.foundation.lazy.items
import androidx.wear.compose.foundation.lazy.rememberScalingLazyListState
import androidx.wear.compose.material.Chip
import androidx.wear.compose.material.ChipDefaults
import androidx.wear.compose.material.Text
import androidx.wear.compose.material.Icon
import com.example.mykotlinwearos.presentation.theme.CustomThemeHelper


@Composable
fun MainScreen(navController: NavController) {
    val colors = CustomThemeHelper.colors

    val buttons = listOf(
        "Blue Screen" to "blue",
        "Green Screen" to "green",
        "Filler Test" to ""
    )

    val listState = rememberScalingLazyListState()

    ScalingLazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(colors.background),
        state = listState,
        horizontalAlignment = Alignment.CenterHorizontally,

    ) {
        item {
            Text(text = "Main Screen", color = colors.textPrimary)
        }

        items(buttons) { (label, route) ->
            Chip(
                onClick = { if (route.isNotEmpty()) navController.navigate(route) },
                label = { Text(label) },

                colors = ChipDefaults.chipColors(
                    backgroundColor = colors.buttonMain,
                    contentColor = colors.textBlack
                )
            )
        }
    }
}

