package com.me.note_app_compose.presintation.fetaures_note_todo

data class NoteTextFieldState(
    val text: String = "",
    val hint: String = "",
    val isHintVisible: Boolean = true
)