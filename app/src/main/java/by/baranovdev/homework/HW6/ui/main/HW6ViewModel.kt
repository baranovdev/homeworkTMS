package by.baranovdev.homework.HW6.ui.main

import android.service.autofill.Validators.not
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HW6ViewModel : ViewModel() {

    var isFirstLaunch = true

    fun changeState(){
        isFirstLaunch = !isFirstLaunch
    }

}