package by.baranovdev.homework.HW5

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.lifecycle.ViewModelProvider
import by.baranovdev.homework.HW4.SnowdropActivity
import by.baranovdev.homework.R
import com.google.android.material.textfield.TextInputLayout

class HW5Activity : AppCompatActivity() {

   lateinit var viewModel: HW5ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hw5)

        viewModel = ViewModelProvider(this).get(HW5ViewModel::class.java)

        val login = findViewById<TextInputLayout>(R.id.fragment_registration_login)
        val password = findViewById<TextInputLayout>(R.id.fragment_registration_password)

        findViewById<Button>(R.id.button_sign_up).setOnClickListener {
            if(!viewModel.checkPassword(password.editText?.text.toString())) password.error = "Not less then 8 symbols"
            else if(login.editText?.text.toString().trim() == "") login.error = "Login must be not empty"
            else startActivity(Intent(this, LoggedActivity::class.java).putExtra("login",login.editText?.text.toString()))
        }
    }
}