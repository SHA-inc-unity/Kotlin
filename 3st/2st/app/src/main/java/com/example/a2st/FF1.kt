package com.example.a2st

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.WindowManager
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.a2st.databinding.FragmentFF1Binding

class FF1 : Fragment(R.layout.fragment_f_f1) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.btn_to_ff2).setOnClickListener {
            findNavController().navigate(R.id.secondFragment)
        }

        view.findViewById<Button>(R.id.btn_to_ff3).setOnClickListener {
            (activity as MainActivity).navigateToFF3()
        }
    }
}
