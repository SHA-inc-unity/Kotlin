package com.example.a2st.View

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.example.a2st.R
import com.example.a2st.ViewModel.FF1_VM
import com.example.a2st.ViewModel.FF2_VM


class FF2 : Fragment(R.layout.fragment_f_f2) {
    var FF2_VM : FF2_VM = FF2_VM();

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var sharedViewModel = ViewModelProvider(requireActivity()).get(FF1_VM::class.java)

        FF2_VM.setAll(sharedViewModel.getLogin(), sharedViewModel.getPassword());

        val logEditText = view.findViewById<EditText>(R.id.login)
        logEditText.setText(FF2_VM.getLogin())
        val passEditText = view.findViewById<EditText>(R.id.password)
        passEditText.setText(FF2_VM.getPassword())

        view.findViewById<Button>(R.id.btn_ff2_to_ff1).setOnClickListener {
            findNavController().navigate(R.id.firstFragment)
        }
    }
}