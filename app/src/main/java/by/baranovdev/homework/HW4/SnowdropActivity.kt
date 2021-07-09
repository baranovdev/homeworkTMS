package by.baranovdev.homework.HW4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.lifecycle.ViewModelProvider
import by.baranovdev.homework.R

class SnowdropActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_snowdrop)

        val viewModel = ViewModelProvider(this).get(SnowdropViewModel::class.java)

        val fragmentAddSnowdrop = SnowdropAddFragment()
        val fragmentCatalogSnowdrops = SnowdropCatalogFragment()

        findViewById<Button>(R.id.button_to_add_fragment).setOnClickListener{
            supportFragmentManager.beginTransaction().replace(R.id.fragment_field,fragmentAddSnowdrop).commit()
        }
        findViewById<Button>(R.id.button_to_show_fragment).setOnClickListener{
            supportFragmentManager.beginTransaction().replace(R.id.fragment_field,fragmentCatalogSnowdrops).commit()
        }

    }
}