package com.example.a2st.ViewModel

import android.widget.EditText

class FF2_VM {

    private var login : String = "";
    private var password : String = "";

    public fun setLogin(login : String){
        this.login = login
    }

    public fun setPassword(password : String){
        this.password = password
    }

    public fun getLogin() : String{
        return login
    }

    public fun getPassword() : String{
        return password
    }

    public fun setAll(logEditText: EditText, passEditText: EditText) {
        this.login = logEditText.text.toString()
        this.password = passEditText.text.toString()
    }

    public fun setAll(login: String, password: String) {
        this.login = login
        this.password = password
    }

}