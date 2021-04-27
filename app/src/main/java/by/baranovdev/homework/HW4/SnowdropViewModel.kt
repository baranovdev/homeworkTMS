package by.baranovdev.homework.HW4

import androidx.lifecycle.ViewModel

class SnowdropViewModel : ViewModel() {

    private val snowdropList = ArrayList<Snowdrop>()

    fun addSnowdrop(species: String, color: String, url: String, height: Double, ) {
        snowdropList.add(Snowdrop(species, color, height, url))
    }

    fun getSnowdrops(): List<Snowdrop> {
        return snowdropList
    }

}