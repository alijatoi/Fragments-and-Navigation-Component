package com.example.multiplefragmentsapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.findNavController


class WelcomeFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_welcome, container, false)
        // set button id with view.findViewById with R.id of button
        val startButton : Button =  view.findViewById(R.id.start)

        startButton.setOnClickListener {
            //Navigation Controller

            view.findNavController().
            navigate(R.id.action_welcomeFragment_to_messageFragment)

        }
        // returning root view
        return view
    }


}