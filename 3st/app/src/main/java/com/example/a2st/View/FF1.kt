package com.example.a2st.View

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.example.a2st.MainActivity
import com.example.a2st.R
import com.example.a2st.ViewModel.FF1_VM

class FF1 : Fragment(R.layout.fragment_f_f1) {
    private var FF1_VM : FF1_VM = FF1_VM()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.btn_to_ff2).setOnClickListener {
            val logEditText = view.findViewById<EditText>(R.id.log)
            val passEditText = view.findViewById<EditText>(R.id.pass)
            FF1_VM.setAll(logEditText, passEditText)

            val bundle = Bundle().apply {
                putString("login", logEditText.text.toString())
                putString("password", passEditText.text.toString())
            }

            findNavController().navigate(R.id.secondFragment, bundle)
        }

        view.findViewById<Button>(R.id.btn_to_ff3).setOnClickListener {
            val logEditText = view.findViewById<EditText>(R.id.log)
            val passEditText = view.findViewById<EditText>(R.id.pass)
            FF1_VM.setAll(logEditText, passEditText)

            val bundle = Bundle().apply {
                putString("login", logEditText.text.toString())
                putString("password", passEditText.text.toString())
            }

            (activity as MainActivity).navigateToFF3(bundle)
        }
    }
}