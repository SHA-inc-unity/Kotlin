package com.example.a2st.View

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.a2st.MainActivity
import com.example.a2st.R
import com.example.a2st.ViewModel.FF1_VM
import com.example.a2st.ViewModel.FF2_VM
import com.example.a2st.ViewModel.FF3_VM


class FF3 : Fragment(R.layout.fragment_f_f3) {
    private var FF3_VM : FF3_VM = FF3_VM();

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val login = arguments?.getString("login")
        val password = arguments?.getString("password")

        view.findViewById<Button>(R.id.btn_ff3_to_ff1).setOnClickListener {
            (activity as MainActivity).navigateToFF1()
        }
    }
}