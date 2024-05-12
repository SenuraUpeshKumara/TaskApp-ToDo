package com.example.taskapp.model

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.parcelize.Parcelize

@Entity(tableName = "task")
@Parcelize
data class Task(
    @PrimaryKey(autoGenerate = true)
    //add
    val id :Int,            //Field 1 will increment automatically
    val taskTitle:String,    //Database field 2
    val taskDesc:String     //Database field 3

):Parcelable
