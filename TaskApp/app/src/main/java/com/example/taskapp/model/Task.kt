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
    val id :Int,            //Field 1
    val taskTitle:String,    //Field 2
    val taskDesc:String     //Field 3
    //val taskPriority:Int
):Parcelable
