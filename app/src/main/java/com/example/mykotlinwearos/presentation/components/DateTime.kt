package com.example.mykotlinwearos.presentation.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.wear.compose.material.Text
import com.example.mykotlinwearos.presentation.theme.AppTypography
import java.time.LocalDate
import java.time.format.DateTimeFormatter

@Composable
fun setDate() {
    val date = LocalDate.now().format(DateTimeFormatter.ofPattern("dd.MM.yyyy"))
    Text(style = AppTypography.body, text = date)
}