package com.me.note_app_compose.di

import android.app.Application
import androidx.room.Room
import com.me.note_app_compose.data.TodoDatabase
import com.me.note_app_compose.data.NoteDatabase
import com.me.note_app_compose.data.repository.NoteRepositoryImpl
import com.me.note_app_compose.data.repository.TodoRepositoryImpl
import com.me.note_app_compose.domain.repository.NoteRepository
import com.me.note_app_compose.domain.repository.TodoRepository
import com.me.note_app_compose.domain.use_case.*
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object NoteModule {

    @Provides
    @Singleton
    fun provideNoteDatabase(app: Application): NoteDatabase {
        return Room.databaseBuilder(
            app,
            NoteDatabase::class.java,
            NoteDatabase.DATABASE_NAME
        ).build()
    }

    @Provides
    @Singleton
    fun provideNoteRepository(db: NoteDatabase): NoteRepository {
        return NoteRepositoryImpl(db.noteDao)
    }

    @Provides
    @Singleton
    fun provideNoteUseCases(repository: NoteRepository): NoteUseCases {
        return NoteUseCases(
            getNotes = GetNotes(repository),
            deleteNote = DeleteNote(repository),
            addNote = AddNote(repository),
            getNote = GetNote(repository)
        )
    }
}