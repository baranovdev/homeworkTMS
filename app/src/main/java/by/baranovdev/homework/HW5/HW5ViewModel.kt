package by.baranovdev.homework.HW5

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HW5ViewModel : ViewModel() {


    private val _login= MutableLiveData<String>()
    var login =_login
    var password:String? = null

    fun checkPassword(pass:String):Boolean{
        return pass.length > 8
    }



}