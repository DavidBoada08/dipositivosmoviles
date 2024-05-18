package com.ramos.myapplication.data.local.repository

import com.ramos.myapplication.data.local.UserClass

class ListUsers {

    // Esta es mi base de datos
    private var listUsers = listOf(
        UserClass(1, "admin", "admin"),
        UserClass(2, "cuno", "speed"),
        UserClass(3, "boka", "chan")
    )

    fun checkUserPass(user: String, contra: String): UserClass? {
        var usReturn: UserClass? = null

        listUsers.forEach { us ->
            if (us.name == user && us.pass == contra) {
                usReturn = us
            }
        }
        return usReturn
    }

    fun checkUserPass2(user: String, contra: String): UserClass? {
        return listUsers.filter { us ->
            us.name == user && us.pass == contra
        }.first()
    }
}