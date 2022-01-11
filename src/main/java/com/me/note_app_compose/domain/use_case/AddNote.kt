package com.me.note_app_compose.domain.use_case

import com.me.note_app_compose.domain.model.InvalidNoteException
import com.me.note_app_compose.domain.model.Note
import com.me.note_app_compose.domain.repository.NoteRepository

class AddNote(
    private val repository: NoteRepository
) {

    @Throws(InvalidNoteException::class)
    suspend operator fun invoke(note: Note) {
        if(note.title.isBlank()) {
            throw InvalidNoteException("Название заметки не может быть пустым.")
        }
        if(note.content.isBlank()) {
            throw InvalidNoteException("Содержимое заметки не может быть пустым.")
        }
        repository.insertNote(note)
    }
}