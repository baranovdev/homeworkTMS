package by.baranovdev.homework

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import by.baranovdev.homework.HW1.ImageLoaderActivity
import by.baranovdev.homework.HW2.SecondHomeworkActivity
import by.baranovdev.homework.HW3.ThirdHomeworkActivity
import by.baranovdev.homework.HW4.SnowdropActivity
import by.baranovdev.homework.HW5.HW5Activity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttons: Array<Button> = arrayOf(
            findViewById(R.id.button_homework_1),
            findViewById(R.id.button_homework_2),
            findViewById(R.id.button_homework_3),
            findViewById(R.id.button_homework_4),
            findViewById(R.id.button_homework_5)
        )

        val intentFirst = Intent(this, ImageLoaderActivity::class.java)
        val intentSecond = Intent(this, SecondHomeworkActivity::class.java)
        val intentThird = Intent(this, ThirdHomeworkActivity::class.java)
        val intentFourth = Intent(this, SnowdropActivity::class.java)
        val intentFifth = Intent(this, HW5Activity::class.java)

        buttons[0].setOnClickListener {
            startActivity(intentFirst)
        }
        buttons[1].setOnClickListener {
            startActivity(intentSecond)
        }
        buttons[2].setOnClickListener{
            startActivity(intentThird)
        }
        buttons[3].setOnClickListener{
            startActivity(intentFourth)
        }
        buttons[4].setOnClickListener{
            startActivity(intentFifth)
        }
    }
}