package by.baranovdev.homework.HW6.ui.main

import android.service.autofill.Validators.not
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HW6ViewModel : ViewModel() {


    private val isOnFirstFragment: MutableLiveData<Boolean> = MutableLiveData(true)
    var _isOnFirstFragment = isOnFirstFragment

    fun setLD(){
        isOnFirstFragment.value = isOnFirstFragment.value?.not()
    }

}