package com.pbm.kalkulator

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    // Deklarasi variabel
    private lateinit var resultTextView: TextView
    private var operand1 = ""
    private var operand2 = ""
    private var operation = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Inisialisasi resultTextView dari layout
        resultTextView = findViewById(R.id.resultTextView)
    }

    // Fungsi untuk menangani klik pada tombol angka
    fun onNumberClick(view: View) {
        val button = view as Button
        val number = button.text.toString()
        resultTextView.append(number) // Menambahkan angka ke resultTextView
    }

    // Fungsi untuk menangani klik pada tombol operasi (+, -, *, /)
    fun onOperationClick(view: View) {
        val button = view as Button
        operation = button.text.toString() // Mendapatkan operasi dari teks tombol
        operand1 = resultTextView.text.toString() // Menyimpan operand pertama
        resultTextView.text = "" // Mengosongkan resultTextView untuk memasukkan operand kedua
    }

    // Fungsi untuk menangani klik pada tombol sama dengan (=)
    fun onEqualsClick(view: View) {
        operand2 = resultTextView.text.toString() // Menyimpan operand kedua
        val result = performOperation() // Melakukan operasi matematika
        resultTextView.text = result // Menampilkan hasil operasi di resultTextView
    }

    // Fungsi untuk menangani klik pada tombol clear (C)
    fun onClearClick(view: View) {
        resultTextView.text = "" // Mengosongkan resultTextView
        operand1 = "" // Mengosongkan operand pertama
        operand2 = "" // Mengosongkan operand kedua
        operation = "" // Mengosongkan operasi
    }

    // Fungsi untuk melakukan operasi matematika
    private fun performOperation(): String {
        val num1 = operand1.toDouble() // Mengonversi operand pertama ke tipe Double
        val num2 = operand2.toDouble() // Mengonversi operand kedua ke tipe Double
        // Melakukan operasi berdasarkan operator yang dipilih
        return when (operation) {
            "+" -> (num1 + num2).toString()
            "-" -> (num1 - num2).toString()
            "*" -> (num1 * num2).toString()
            "/" -> (num1 / num2).toString()
            else -> "" // Mengembalikan string kosong jika operator tidak valid
        }
    }
}
