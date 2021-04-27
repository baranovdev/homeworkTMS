package by.baranovdev.homework.HW4

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.RecyclerView
import by.baranovdev.homework.HW4.recycler.SnowdropAdapter
import by.baranovdev.homework.R
import com.google.android.material.slider.Slider
import kotlinx.android.synthetic.*

class SnowdropCatalogFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_snowdrop_catalog, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val viewModel = ViewModelProvider(requireActivity()).get(SnowdropViewModel::class.java)

        val recycler = view.findViewById<RecyclerView>(R.id.recycler)

        val snowdrops = viewModel.getSnowdrops()

        val snowdropAdapter = SnowdropAdapter(snowdrops)

        recycler.adapter = snowdropAdapter

    }

}

