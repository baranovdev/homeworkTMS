package by.baranovdev.homework.HW2

import android.graphics.drawable.AnimationDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import by.baranovdev.homework.R

class AnimationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_animation)

        val animation = findViewById<ImageView>(R.id.animation_view)

        animation.setImageResource(R.drawable.animation_cat)

        val catAnimation = animation.drawable as AnimationDrawable

        catAnimation.start()
    }
}