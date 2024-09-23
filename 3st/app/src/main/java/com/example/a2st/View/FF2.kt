package com.example.a2st.View

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.example.a2st.R
import com.example.a2st.ViewModel.FF1_VM
import com.example.a2st.ViewModel.FF2_VM


class FF2 : Fragment(R.layout.fragment_f_f2) {
    private var FF2_VM : FF2_VM = FF2_VM();

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val login = arguments?.getString("login")
        val password = arguments?.getString("password")

        if (password != null && login != null) {
            FF2_VM.setAll(login, password)
        };

        view.findViewById<TextView>(R.id.login).setText(login)
        view.findViewById<TextView>(R.id.password).setText(password)

        view.findViewById<Button>(R.id.btn_ff2_to_ff1).setOnClickListener {
            findNavController().navigate(R.id.firstFragment)
        }
    }
}