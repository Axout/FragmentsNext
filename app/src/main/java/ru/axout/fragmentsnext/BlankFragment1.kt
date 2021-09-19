package ru.axout.fragmentsnext

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import ru.axout.fragmentsnext.databinding.Fragment1Binding

class BlankFragment1 : Fragment() {

    lateinit var binding: Fragment1Binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = Fragment1Binding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.btFrag1.setOnClickListener {
            val action = BlankFragment1Directions.actionBlankFragment1ToBlankFragment2()
            findNavController().navigate(action)
        }
    }
}