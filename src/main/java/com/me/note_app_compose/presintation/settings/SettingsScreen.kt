package com.me.note_app_compose.presintation.settings

import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.alorma.compose.settings.storage.preferences.rememberPreferenceIntSettingState
import com.alorma.compose.settings.ui.SettingsList
import com.me.note_app_compose.util.AppScaffold


@Composable
fun ListScreen(
    navController: NavController = rememberNavController(),
) {
    AppScaffold(
        title = { Text(text = "Настройки") },
        onBack = { navController.popBackStack() },
    ) {
        val ThemeChoice = rememberPreferenceIntSettingState(key = "Theme")
        SettingsList(
            state = ThemeChoice,
            title = { Text(text = "Изменить тему") },
            subtitle = { Text(text = "Тёмную или светлую") },
            items = listOf("Тёмная, светлая"),
            action = {
                val checkedState = remember { mutableStateOf(true) }
                Switch( checked = checkedState.value,
                    onCheckedChange = { checkedState.value = it })
            }
        )

        val CalendarChoice = rememberPreferenceIntSettingState(key = "Calendar")
        SettingsList(
            state = CalendarChoice,
            title = { Text(text = "Напоминания") },
            subtitle = { Text(text = "Установить на...") },
            items = listOf("Дата, время, событие"),
            action = {
            }
        )
    }
}
