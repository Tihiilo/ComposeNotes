package com.me.note_app_compose.presintation.note

import com.me.note_app_compose.domain.model.Note
import com.me.note_app_compose.util.NoteOrder

sealed class NotesEvent {
    data class Order(val noteOrder: NoteOrder): NotesEvent()
    data class DeleteNote(val note: Note): NotesEvent()
    object RestoreNote: NotesEvent()
    object ToggleOrderSection: NotesEvent()
}