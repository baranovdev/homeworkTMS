package by.baranovdev.homework

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import by.baranovdev.homework.HW1.ImageLoaderActivity
import by.baranovdev.homework.HW2.SecondHomeworkActivity
import by.baranovdev.homework.HW3.ThirdHomeworkActivity
import by.baranovdev.homework.HW4.SnowdropActivity
import by.baranovdev.homework.HW5.HW5Activity
import by.baranovdev.homework.HW6.HW6Activity


class MainActivity : AppCompatActivity() {

    val viewModel by lazy { ViewModelProvider(this).get(MainViewModel::class.java) }



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttons: Array<Button> = arrayOf(
            findViewById(R.id.button_homework_1),
            findViewById(R.id.button_homework_2),
            findViewById(R.id.button_homework_3),
            findViewById(R.id.button_homework_4),
            findViewById(R.id.button_homework_5),
            findViewById(R.id.button_homework_6)
        )
        val intents: Array<Intent> = arrayOf(
            Intent(this, ImageLoaderActivity::class.java),
            Intent(this, SecondHomeworkActivity::class.java),
            Intent(this, ThirdHomeworkActivity::class.java),
            Intent(this, SnowdropActivity::class.java),
            Intent(this, HW5Activity::class.java),
            Intent(this, HW6Activity::class.java),
        )

        buttons[0].setOnClickListener {
            startActivity(intents[0])
        }
        buttons[1].setOnClickListener {
            startActivity(intents[1])
        }
        buttons[2].setOnClickListener{
            startActivity(intents[2])
        }
        buttons[3].setOnClickListener{
            startActivity(intents[3])
        }
        buttons[4].setOnClickListener{
            startActivity(intents[4])
        }
        buttons[5].setOnClickListener{
            startActivity(intents[5])
        }
    }
}