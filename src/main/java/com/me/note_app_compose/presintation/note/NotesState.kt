package com.me.note_app_compose.presintation.note

import com.me.note_app_compose.domain.model.Note
import com.me.note_app_compose.util.NoteOrder
import com.me.note_app_compose.util.OrderType

data class NotesState(
    val notes: List<Note> = emptyList(),
    val noteOrder: NoteOrder = NoteOrder.Date(OrderType.Descending),
    val isOrderSectionVisible: Boolean = false
)