package com.example.a1st

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import java.util.Date

class MainActivity : AppCompatActivity() {
    var cashList : CashList = CashList();

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        cashList.addCash(Cash(0, 100, "for food", Date()))
        cashList.addCash(Cash(1, 200, "for drink", Date()))
        cashList.addCash(Cash(2, 300, "for food", Date()))
        cashList.addCash(Cash(4, 400, "for drink", Date()))
    }

    fun getInfo(view: View) {
        val textView: TextView = this.findViewById(R.id.text)
        val inputTextView: TextView = this.findViewById(R.id.gettedText)

        val id = inputTextView.text.toString().toIntOrNull()

        if (id != null) {
            val info = cashList.getCashById(id)
            textView.text = info ?: "No cash found with id $id"
        } else {
            textView.text = "Invalid ID"
        }
    }
}
