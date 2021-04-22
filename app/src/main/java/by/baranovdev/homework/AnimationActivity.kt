package by.baranovdev.homework

import android.graphics.drawable.AnimationDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

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