package by.baranovdev.homework.HW6.ui.main

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import by.baranovdev.homework.R

class HW6SecondFragment : Fragment() {

    companion object {
        fun newInstance() = HW6SecondFragment()
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
        viewModel._isOnFirstFragment.observe(viewLifecycleOwner){
            findNavController().navigate(R.id.showFirstFragment)
        }
    }

}