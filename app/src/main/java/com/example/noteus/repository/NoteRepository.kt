package com.example.noteus.repository

import com.example.noteus.database.NoteDatabase
import com.example.noteus.model.Note

class NoteRepository(private val db: NoteDatabase){

    suspend fun insertNote(note: Note) = db.getNoteDao().insertNote(note)
    suspend fun deleteNote(note: Note) = db.getNoteDao().insertNote(note)
    suspend fun updateNote(note: Note) = db.getNoteDao().insertNote(note)

    fun getAllNotes() = db.getNoteDao().getAllNotes()
    fun searchNote(query: String?) = db.getNoteDao().searchQuery(query)
}