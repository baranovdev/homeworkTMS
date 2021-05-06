package by.baranovdev.homework.HW5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import by.baranovdev.homework.R

class LoggedActivity : AppCompatActivity() {

    lateinit var viewModel: HW5ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_logged)
        viewModel = ViewModelProvider(this).get(HW5ViewModel::class.java)
        findViewById<TextView>(R.id.fragment_logged_login).text = intent.getStringExtra("login")
    }
}