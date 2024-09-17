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
import com.example.a2st.databinding.FragmentFF3Binding


class FF3 : Fragment(R.layout.fragment_f_f3) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.btn_ff3_to_ff1).setOnClickListener {
            (activity as MainActivity).navigateToFF1()
        }
    }
}