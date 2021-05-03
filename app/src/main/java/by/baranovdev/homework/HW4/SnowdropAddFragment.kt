package by.baranovdev.homework.HW4

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import by.baranovdev.homework.R
import com.google.android.material.slider.Slider
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout
import kotlinx.android.synthetic.*

class SnowdropAddFragment : Fragment(){

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_snowdrop_add,container,false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val viewModel = ViewModelProvider(requireActivity()).get(SnowdropViewModel::class.java)

        val species = view.findViewById<TextInputEditText>(R.id.input_species_text)
        val color = view.findViewById<TextInputEditText>(R.id.input_color_text)
        val url = view.findViewById<TextInputEditText>(R.id.input_url_text)
        val height = view.findViewById<Slider>(R.id.input_height)

        view.findViewById<Button>(R.id.button_add_snowdrop).setOnClickListener{
            viewModel.addSnowdrop(
                species.text.toString(),
                color.text.toString(),
                url.text.toString(),
                height.value.toString().toDouble()
            )
            Snackbar.make(view, "Your snowdrop is added", Snackbar.LENGTH_SHORT)
        }

    }

}