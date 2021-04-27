package by.baranovdev.homework.HW2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import by.baranovdev.homework.R

class SecondHomeworkActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_homework)

        val buttons : Array<Button> = arrayOf(findViewById(R.id.button_flags),findViewById(R.id.button_animation))
        val intentFirst = Intent(this, FlagsActivity::class.java)
        val intentSecond = Intent(this, AnimationActivity::class.java)

        buttons[0].setOnClickListener {
            startActivity(intentFirst)
        }
        buttons[1].setOnClickListener {
            startActivity(intentSecond)
        }
    }
}