package com.me.note_app_compose.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val DarkColorPalette = darkColors(

onBackground = Color.White,
    background = DarkGray,
    primary = Color.White,
   surface = LightBlue,
       onSurface = DarkGray
)

private val LightColorPalette = lightColors(
    onBackground = Color.White,
    background = DarkGray,
    primary = Color.White,
    surface = LightBlue,
    onSurface = DarkGray



)

@Composable
fun Note_app_composeTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable() () -> Unit
) {
    val colors = if (darkTheme) {
        DarkColorPalette
    } else {
        LightColorPalette
    }

    MaterialTheme(
        colors = colors,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}