package com.example.mykotlinwearos.presentation.components

import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

import androidx.wear.compose.material.Button
import androidx.wear.compose.material.ButtonDefaults
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.Dp
import androidx.wear.compose.material.Icon
import com.example.mykotlinwearos.presentation.theme.CustomThemeHelper
import kotlinx.coroutines.internal.OpDescriptor


/**
 * Uudelleenkäytettävä Wear OS -painike, johon voi antaa ikonin käyttöpaikassa.
 *
 * @param text painikkeen teksti
 * @param onClick click-handler
 * @param modifier Modifier (ei pakollinen)
 * @param iconSlot valinnainen composable-slot jolle voit antaa ikonisi (esim. { Icon(...) } )
 * @param iconAtEnd jos true, ikoni näytetään tekstin jälkeen; muuten ennen tekstiä
 * @param enabled onko painike aktiivinen
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