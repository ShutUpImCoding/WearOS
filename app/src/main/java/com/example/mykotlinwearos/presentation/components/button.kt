package com.example.mykotlinwearos.presentation.components

import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp

import androidx.wear.compose.material.Button
import androidx.wear.compose.material.ButtonDefaults
import androidx.compose.ui.unit.Dp
import androidx.wear.compose.material.Icon
import com.example.mykotlinwearos.presentation.theme.CustomThemeHelper



/**
 * Re usable icon button, icon added on function
 *
 *
 IconButton(
 onClick = { /* do sth */ },
iconSlot = {
 Icon(
 imageVector = Icons.Default.Favorite,
contentDescription = "favorite",
 modifier = Modifier.size(12.dp)
 )
 }
   )
 */
@Composable
fun IconButton(
    icon: ImageVector,
    contentDescription: String? = null,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    iconSize: Dp = 60.dp,
    enabled: Boolean = true
) {
    val colors = CustomThemeHelper.colors

    Button(
        onClick = onClick,
        modifier = modifier.size(100.dp),
        enabled = enabled,
        colors = ButtonDefaults.buttonColors(
            backgroundColor = colors.buttonMain,
            contentColor = colors.textBlack
        ),
        shape = CircleShape
    ) {
        Icon(
            imageVector = icon,
            contentDescription = contentDescription,
            modifier = Modifier.size(iconSize)
        )
    }
}