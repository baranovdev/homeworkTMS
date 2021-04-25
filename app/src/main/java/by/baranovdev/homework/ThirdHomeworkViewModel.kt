package by.baranovdev.homework

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.*
import java.util.*

class ThirdHomeworkViewModel : ViewModel() {

    private val random = Random()


    val firstRegion = MutableLiveData(Region(0,0,0,1))
    val secondRegion = MutableLiveData(Region(0,0,0,2))
    val thirdRegion = MutableLiveData(Region(0,0,0,3))

    val winnerId = MutableLiveData(0)

    fun getData(){
            viewModelScope.launch {
                while(winnerId.value == 0){
                    delay(random.nextInt(1000).toLong())
                    updateRegion(firstRegion)
                }
            }
            viewModelScope.launch {
                while(winnerId.value == 0){
                    delay(random.nextInt(1000).toLong())
                    updateRegion(secondRegion)
                }
            }
            viewModelScope.launch {
                while(winnerId.value == 0){
                    delay(random.nextInt(1000).toLong())
                    updateRegion(thirdRegion)
                }
            }

    }

    private fun updateRegion(region: MutableLiveData<Region>){
            region.value = region.value.also {
                it?.wheat = it?.wheat?.plus(random.nextInt(30)) ?: 0
                it?.rye = it?.rye?.plus(random.nextInt(30)) ?: 0
                it?.oats = it?.oats?.plus(random.nextInt(30)) ?: 0
            }
        if(region.value?.wheat ?: 0 > 1000 && region.value?.rye ?: 0 > 1000 && region.value?.oats ?: 0 > 1000)
            winnerId.value = winnerId.value.also {
                winnerId.value = region.value?.id
            }
    }

}