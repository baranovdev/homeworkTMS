package by.baranovdev.homework

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope
import kotlinx.android.synthetic.main.activity_third_homework.*
import kotlinx.coroutines.cancel

class ThirdHomeworkActivity : AppCompatActivity() {

    lateinit var viewModel: ThirdHomeworkViewModel

    @SuppressLint("ResourceAsColor")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third_homework)

        viewModel = ViewModelProvider(this).get(ThirdHomeworkViewModel::class.java)

        viewModel.firstRegion.observe(this){
            first_region_wheat.text = it.wheat.toString()
            first_region_rye.text = it.rye.toString()
            first_region_oats.text = it.wheat.toString()
        }
        viewModel.secondRegion.observe(this){
            second_region_wheat.text = it.wheat.toString()
            second_region_rye.text = it.rye.toString()
            second_region_oats.text = it.oats.toString()
        }
        viewModel.thirdRegion.observe(this){
            third_region_wheat.text = it.wheat.toString()
            third_region_rye.text = it.rye.toString()
            third_region_oats.text = it.oats.toString()
        }
        viewModel.winnerId.observe(this){
            if(it != 0)viewModel.viewModelScope.cancel()
            when(it){
                1 -> {
                    first_region_name.setBackgroundColor(R.color.teal_700)
                    first_region_name.text = first_region_name.text.toString().plus(" (WINNER)")
                }
                2 -> {
                    second_region_name.setBackgroundColor(R.color.teal_700)
                    second_region_name.text = second_region_name.text.toString().plus(" (WINNER)")
                }
                3 -> {
                    third_region_name.setBackgroundColor(R.color.teal_700)
                    third_region_name.text = third_region_name.text.toString().plus(" (WINNER)")
                }
            }
        }
        viewModel.getData()

    }
}