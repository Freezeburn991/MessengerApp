package com.blue.dragon.ui.login

import com.blue.dragon.ui.auth.AuthView
import com.blue.dragon.ui.base.BaseView

interface LoginView :BaseView, AuthView{

    fun showProgress()
    fun hideProgress()
    fun setUsernameError()
    fun setPasswordError()
    fun navigateToSignUp()
    fun navigateToHome()
}