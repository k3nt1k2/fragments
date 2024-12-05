package com.example.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.lifecycle.ViewModelProvider

class BlankFragment : Fragment() {
    private lateinit var sharedViewModel: MainActivity.SharedViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_blank, container, false)
        sharedViewModel = ViewModelProvider(requireActivity()).get(MainActivity.SharedViewModel::class.java)

        view.findViewById<Button>(R.id.button_send).setOnClickListener {
            val data = "этот текст будет снизу"
            sharedViewModel.setData(data)
        }
        return view
    }

    companion object {
        @JvmStatic
        fun newInstance() = BlankFragment()


            }
    }
