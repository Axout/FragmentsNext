package ru.axout.fragmentsnext

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import ru.axout.fragmentsnext.databinding.Fragment2Binding

class BlankFragment2 : Fragment() {

    lateinit var binding: Fragment2Binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = Fragment2Binding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.btFrag2.setOnClickListener {
            val action = BlankFragment2Directions.actionBlankFragment2ToBlankFragment3()
            findNavController().navigate(action)
        }
    }
}