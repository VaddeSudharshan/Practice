package com.rishva.roomdatabase_practiceapp.model

import android.icu.text.CaseMap.Title
import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.parcelize.Parcelize
import java.lang.invoke.TypeDescriptor

@Entity(tableName = "notes")
@Parcelize
data class Note(

    @PrimaryKey(autoGenerate = true)
    val id : Int,
    val noteTitle: String ,
    val noteDesc : String
) : Parcelable
