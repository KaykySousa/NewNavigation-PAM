package com.example.newnavigation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation

class FifthFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fifth_fragment, container, false)

        view.setOnClickListener { Navigation.findNavController(view).navigate(R.id.action_fifthFragment_to_sixthFragment) }

        return view
    }
}