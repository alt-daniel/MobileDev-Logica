package com.example.logicaapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_logica.*

class LogicaActivity : AppCompatActivity() {

    var emptyText = "One or more fields are empty!"
    var correct = "All answers are correct!"
    var incorrect = "One or more answers are incorrect!"


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_logica)
        initViews()
    }

    private fun initViews() {
        btnSubmit.setOnClickListener { getAnswer() }
    }

    private fun getLogica(answer1: String, answer2: String): String {
        if (answer1 == "T" && answer2 == "T") {
            return "T"
        } else {
            return "F"
        }
    }

    private fun getAnswer() {
        val resultText1 = editTextCase1.text.toString()
        val resultText2 = editTextCase2.text.toString()
        val resultText3 = editTextCase3.text.toString()
        val resultText4 = editTextCase4.text.toString()

        val txtLeftCase1 = txtLeftCase1.text.toString()
        val txtRightCase1 = txtRightCase1.text.toString()
        val txtLeftCase2 = txtLeftCase2.text.toString()
        val txtRightCase2 = txtRightCase2.text.toString()
        val txtLeftCase3 = txtLeftCase3.text.toString()
        val txtRightCase3 = txtRightCase3.text.toString()
        val txtLeftCase4 = txtLeftCase4.text.toString()
        val txtRightCase4 = txtRightCase4.text.toString()


        if (resultText1.isEmpty() || resultText2.isEmpty() || resultText3.isEmpty() || resultText4.isEmpty()) {
            Toast.makeText(this, emptyText, Toast.LENGTH_SHORT).show()
        } else if (getLogica(txtLeftCase1, txtRightCase1) == resultText1
            && getLogica(txtLeftCase2, txtRightCase2) == resultText2
            && getLogica(txtLeftCase3, txtRightCase3) == resultText3
            && getLogica(txtLeftCase4, txtRightCase4) == resultText4
        ) {
            Toast.makeText(this, correct, Toast.LENGTH_SHORT)
                .show()
        } else {
            Toast.makeText(this, incorrect, Toast.LENGTH_SHORT)
                .show()
        }
    }
}


