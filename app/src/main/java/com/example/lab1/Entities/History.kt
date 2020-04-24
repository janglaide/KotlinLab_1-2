package com.example.lab1.Entities

import android.os.Build
import androidx.annotation.RequiresApi
import java.text.DateFormat
import java.time.LocalDateTime
import java.time.Month

class History{
    var id : Int = 0
    @RequiresApi(Build.VERSION_CODES.O)
    var datetime : LocalDateTime = LocalDateTime.of(2020, Month.APRIL, 15, 3, 15)
    var taskId: Int = 0
    constructor(Id: Int, Datetime: LocalDateTime, TaskId : Int){
        id = Id
        datetime = Datetime
        taskId = TaskId
    }
    constructor(Datetime: LocalDateTime, TaskId : Int){
        datetime = Datetime
        taskId = TaskId
    }
}