package com.example.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider


class BlankFragment2 : Fragment() {
    private lateinit var sharedViewModel: MainActivity.SharedViewModel
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_blank2, container, false)
        sharedViewModel = ViewModelProvider(requireActivity()).get(MainActivity.SharedViewModel::class.java)

        sharedViewModel.sharedData.observe(viewLifecycleOwner, Observer { data ->
            view.findViewById<TextView>(R.id.textView_data2).text = data
        })

        return view
    }

    companion object {
        @JvmStatic
        fun newInstance() = BlankFragment2()
    }
}