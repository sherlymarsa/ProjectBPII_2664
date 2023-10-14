package com.example.project2664

class Login {
    var username = ""
    var password = ""


    fun loginCheck():Boolean{
        if(username.equals("marsa") && password.equals("1234")){
            return true
        }else{
            return false
        }
    }
}