package com.me.note_app_compose.util

sealed class Screen(val route: String) {
    object AddTodoScreen:Screen ("add_edit_todo")
    object SettingsScreen: Screen( "settings_screen")
    object NotesScreen: Screen("notes_screen")
    object AddEditNoteScreen: Screen("add_edit_note_screen")
}