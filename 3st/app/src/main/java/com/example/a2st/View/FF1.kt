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
    private lateinit var FF1_VM : FF1_VM

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        FF1_VM = ViewModelProvider(requireActivity()).get(com.example.a2st.ViewModel.FF1_VM::class.java)

        view.findViewById<Button>(R.id.btn_to_ff2).setOnClickListener {
            val logEditText = view.findViewById<EditText>(R.id.log)
            val passEditText = view.findViewById<EditText>(R.id.pass)
            FF1_VM.setAll(logEditText, passEditText)
            findNavController().navigate(R.id.secondFragment)
        }

        view.findViewById<Button>(R.id.btn_to_ff3).setOnClickListener {
            val logEditText = view.findViewById<EditText>(R.id.log)
            val passEditText = view.findViewById<EditText>(R.id.pass)
            FF1_VM.setAll(logEditText, passEditText)
            (activity as MainActivity).navigateToFF3()
        }
    }
}

public fun ViewModelProvider.get(modelClass: Class<FF1_VM>): FF1_VM {
    return this.get(modelClass)
}
