package by.baranovdev.homework

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import com.squareup.picasso.Picasso

class ImageLoaderActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_homework_1)

        val textEditor = findViewById<EditText>(R.id.url_editor)
        val loadButton = findViewById<Button>(R.id.button_load_image)
        val backButton = findViewById<Button>(R.id.back_button)
        val image = findViewById<ImageView>(R.id.image_homework_1)

        val intent = Intent(this, MainActivity::class.java)

        loadButton.setOnClickListener {
            val pic = Picasso.get().load(textEditor.text.toString()).into(image)
        }

        backButton.setOnClickListener {
            startActivity(intent)
        }


    }
}