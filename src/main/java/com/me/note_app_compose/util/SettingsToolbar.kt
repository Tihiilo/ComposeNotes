package com.me.note_app_compose.util

import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.HelpOutline
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable

@Composable
fun SettingsToolbar(
    title: @Composable () -> Unit,
    onBack: (() -> Unit)? = null,
    onSearch: (() -> Unit)? = null,
    onHelp: (() -> Unit)? = null,
) {
    TopAppBar(
        title = title,
        navigationIcon = {
            if (onBack != null) {
                IconButton(onClick = { onBack.invoke() }) {
                    Icon(
                        imageVector = Icons.Default.ArrowBack,
                        contentDescription = null,
                    )
                }
            }
        },
        backgroundColor = MaterialTheme.colors.surface,
        contentColor = MaterialTheme.colors.primary,
        actions = {
            if (onSearch != null) {
                IconButton(onClick = { onSearch.invoke() }) {
                    Icon(
                        imageVector = Icons.Default.Search,
                        contentDescription = null,
                    )
                }
            }
            if (onHelp != null) {
                IconButton(onClick = { onHelp.invoke() }) {
                    Icon(
                        imageVector = Icons.Default.HelpOutline,
                        contentDescription = null,
                    )
                }
            }
        },
    )
}