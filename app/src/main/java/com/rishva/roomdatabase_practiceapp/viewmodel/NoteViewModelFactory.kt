package com.rishva.roomdatabase_practiceapp.viewmodel

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewmodel.CreationExtras
import com.rishva.roomdatabase_practiceapp.repository.NoteRepository

class NoteViewModelFactory (val app:Application , private val noteRepository: NoteRepository) : ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>, extras: CreationExtras): T {
        return NoteViewModel(app, noteRepository) as T
    }
}