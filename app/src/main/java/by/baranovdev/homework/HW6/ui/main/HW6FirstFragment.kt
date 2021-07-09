package by.baranovdev.homework.HW6.ui.main

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import by.baranovdev.homework.R
import android.view.MotionEvent
import android.widget.Button
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.navigation.Navigation
import androidx.navigation.Navigation.findNavController
import androidx.navigation.fragment.findNavController

class HW6FirstFragment : Fragment(){

    companion object {
        fun newInstance() = HW6FirstFragment()
    }


    private lateinit var viewModel: HW6ViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.fragment_first, container, false)
    }



    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(HW6ViewModel::class.java)

        view?.findViewById<ConstraintLayout>(R.id.hw6_first_layout)?.setOnClickListener{
            findNavController().navigate(R.id.showSecondFragment)
        }
    }



}