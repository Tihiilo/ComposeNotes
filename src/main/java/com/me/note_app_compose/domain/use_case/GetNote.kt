package com.me.note_app_compose.domain.use_case

import com.me.note_app_compose.domain.model.Note
import com.me.note_app_compose.domain.repository.NoteRepository

class GetNote(
    private val repository: NoteRepository
) {

    suspend operator fun invoke(id: Int): Note? {
        return repository.getNoteById(id)
    }
}