package com.ramos.myapplication.data.local

import android.util.Log

data class UserClass (
    var id: Int,
    var name: String,
    var pass: String
)
// Puede tener mas constructores

{
    // Viene a ser una fn
    init {
        Log.d("Data", "Se construye nueva instancia de users")
    }
}

