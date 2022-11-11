package com.example.crimesa

import java.util.*

data class Crime (var id: UUID = UUID.randomUUID())  {
    var title:String = ""
    var date: Date? = null
    var isSolved: Boolean? = null
    constructor(id: UUID, title: String, date: Date, isSolved:Boolean):this(id){
        this.title = title
        this.date = date
        this.id = id
        this.isSolved=isSolved
    }
}