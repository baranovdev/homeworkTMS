package by.baranovdev.homework.HW6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.findNavController
import by.baranovdev.homework.HW5.HW5ViewModel
import by.baranovdev.homework.HW6.ui.main.HW6ViewModel
import by.baranovdev.homework.R

class HW6Activity : AppCompatActivity() {

    lateinit var viewModel : HW6ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_homework_6)

        viewModel = ViewModelProvider(this).get(HW6ViewModel::class.java)

        findViewById<Button>(R.id.button_rotate).setOnClickListener{
            viewModel.setLD()
        }



    }
}