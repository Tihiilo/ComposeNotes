package com.me.note_app_compose.data

import androidx.room.Database
import androidx.room.RoomDatabase
import com.me.note_app_compose.domain.model.Note


@Database(
    entities = [Note::class],
    version = 1
)
abstract class NoteDatabase: RoomDatabase() {

    abstract val noteDao: NoteDao

    companion object {
        const val DATABASE_NAME = "notes_db"
    }
}