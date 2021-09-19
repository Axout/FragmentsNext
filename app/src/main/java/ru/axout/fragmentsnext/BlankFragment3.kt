package ru.axout.fragmentsnext

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
import ru.axout.fragmentsnext.databinding.Fragment3Binding

class BlankFragment3 : Fragment() {

    lateinit var binding: Fragment3Binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = Fragment3Binding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.btFrag3.setOnClickListener {
            val action = BlankFragment3Directions.actionBlankFragment3ToBlankFragment1()
            findNavController().navigate(action)
        }
    }
}