package com.rishva.roomdatabase_practiceapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.rishva.roomdatabase_practiceapp.database.NoteDatabase
import com.rishva.roomdatabase_practiceapp.repository.NoteRepository
import com.rishva.roomdatabase_practiceapp.viewmodel.NoteViewModel
import com.rishva.roomdatabase_practiceapp.viewmodel.NoteViewModelFactory

class MainActivity : AppCompatActivity() {

    lateinit var noteViewModel: NoteViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setUpViewModel()
    }

    private fun setUpViewModel(){
        val noteRepository = NoteRepository(NoteDatabase(this))
        val viewModelProviderFactory = NoteViewModelFactory(application,noteRepository)

        noteViewModel = ViewModelProvider(this , viewModelProviderFactory)[NoteViewModel::class.java]
    }
}