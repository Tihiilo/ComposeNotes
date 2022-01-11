package com.me.note_app_compose.data

import androidx.room.Database
import androidx.room.RoomDatabase
import com.me.note_app_compose.data.TodoDao
import com.me.note_app_compose.domain.model.Todo

@Database(
    entities = [Todo::class],
    version = 1
)
abstract class TodoDatabase: RoomDatabase() {

    abstract val dao: TodoDao
}