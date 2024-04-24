package com.pbm.kalkulator

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var resultTextView: TextView
    private var operand1 = ""
    private var operand2 = ""
    private var operation = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        resultTextView = findViewById(R.id.resultTextView)
    }

    fun onNumberClick(view: View) {
        val button = view as Button
        val number = button.text.toString()
        resultTextView.append(number)
    }

    fun onOperationClick(view: View) {
        val button = view as Button
        operation = button.text.toString()
        operand1 = resultTextView.text.toString()
        resultTextView.text = ""
    }

    fun onEqualsClick(view: View) {
        operand2 = resultTextView.text.toString()
        val result = performOperation()
        resultTextView.text = result
    }

    fun onClearClick(view: View) {
        resultTextView.text = ""
        operand1 = ""
        operand2 = ""
        operation = ""
    }

    private fun performOperation(): String {
        val num1 = operand1.toDouble()
        val num2 = operand2.toDouble()
        return when (operation) {
            "+" -> (num1 + num2).toString()
            "-" -> (num1 - num2).toString()
            "*" -> (num1 * num2).toString()
            "/" -> (num1 / num2).toString()
            else -> ""
        }
    }
}
