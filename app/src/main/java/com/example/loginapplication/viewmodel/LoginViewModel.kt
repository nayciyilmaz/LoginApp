package com.example.loginapplication.viewmodel

import android.util.Patterns
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.example.loginapplication.R

class LoginViewModel : ViewModel() {

    var username by mutableStateOf("")
        private set

    var password by mutableStateOf("")
        private set

    var email by mutableStateOf("")
        private set


    fun updateUsername(value: String) {
        username = value
    }

    fun updatePassword(value: String) {
        password = value
    }

    fun updateEmail(value: String) {
        email = value
    }

    fun isSignInReset() {
        email = ""
        password = ""
    }

    fun isSignUpReset() {
        email = ""
        password = ""
        username = ""
    }

    fun isEmailValid() = Patterns.EMAIL_ADDRESS.matcher(email).matches()

    fun isEmailBlank() = email.isBlank()

    fun isPasswordValid() = password.length >= 6

    fun isPasswordBlank() = password.isBlank()

    fun isNameValid() = username.trim().length >= 3

    fun isNameBlank() = username.isBlank()

    fun isEmailAndPasswordValid() = isEmailValid() && isPasswordValid()

    fun formValid() = isNameValid() && isPasswordValid() && isEmailValid()
}