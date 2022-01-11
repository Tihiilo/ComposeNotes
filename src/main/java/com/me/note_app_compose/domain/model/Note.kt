package com.me.note_app_compose.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.me.note_app_compose.ui.theme.*

@Entity
data class Note(
    val title: String,
    val content: String,
    val timestamp: Long,
    val color: Int,
    @PrimaryKey val id: Int? = null
) {
    companion object {
        val noteColors = listOf(RedOrange, Chartreuse, Violet, Mimosa, Orange)
    }
}

class InvalidNoteException(message: String): Exception(message)