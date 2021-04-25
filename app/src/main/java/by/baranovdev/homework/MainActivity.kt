package by.baranovdev.homework

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttons: Array<Button> = arrayOf(
            findViewById<Button>(R.id.button_homework_1),
            findViewById<Button>(R.id.button_homework_2),
            findViewById<Button>(R.id.button_homework_3)
        )

        val intentFirst = Intent(this, ImageLoaderActivity::class.java)
        val intentSecond = Intent(this, SecondHomeworkActivity::class.java)
        val intentThird = Intent(this, ThirdHomeworkActivity::class.java)

        buttons[0].setOnClickListener {
            startActivity(intentFirst)
        }
        buttons[1].setOnClickListener {
            startActivity(intentSecond)
        }
        buttons[2].setOnClickListener{
            startActivity(intentThird)
        }
    }
}