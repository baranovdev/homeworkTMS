package by.baranovdev.homework

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView

class ImageLoaderActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_homework_1)

        val textEditor = findViewById<EditText>(R.id.url_editor)
        val loadButton = findViewById<Button>(R.id.button_load_image)
        val image = findViewById<ImageView>(R.id.image_homework_1)



    }
}