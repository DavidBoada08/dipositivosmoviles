package com.ramos.myapplication.logic.userCases

import android.util.Log
import com.ramos.myapplication.data.network.endpoints.UsersEndpoint
import com.ramos.myapplication.data.network.repository.RetrofitBase

class GetAllUsersUserCase {
    operator fun invoke() {
        val call = RetrofitBase.returnBaseRetrofit()
        val service = call.create(UsersEndpoint::class.java)
        val response = service.getAllUsers()

        if(response.isSuccessful) {
            val body = response.body()
            Log.d("RSP", body.toString())
        } else {
            Log.d("RSP", "La ejecucion fallo")
        }
    }
}