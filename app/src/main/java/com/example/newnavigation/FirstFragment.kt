package com.example.newnavigation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation

class FirstFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.first_fragment, container, false)

        view.findViewById<Button>(R.id.buttonToSecondFragment).setOnClickListener { Navigation.findNavController(view).navigate(R.id.action_firstFragment_to_secondFragment) }
        view.findViewById<Button>(R.id.buttonToThirdFragment).setOnClickListener { Navigation.findNavController(view).navigate(R.id.action_firstFragment_to_thirdFragment) }

        return view
    }


}