package com.rishva.roomdatabase_practiceapp.repository

import com.rishva.roomdatabase_practiceapp.database.NoteDatabase
import com.rishva.roomdatabase_practiceapp.model.Note

class NoteRepository(private val db : NoteDatabase ) {

    suspend fun insertNote(note: Note) = db.getNoteDao().insertNote(note)
    suspend fun deleteNote(note: Note) = db.getNoteDao().deleteNote(note)
    suspend fun updateNote(note: Note) = db.getNoteDao().updateNote(note)

     fun getAllNotes() = db.getNoteDao().getAllNotes()
     fun searchNote(query:String?) = db.getNoteDao().searchNote(query)


}