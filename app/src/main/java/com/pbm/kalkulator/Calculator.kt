package com.pbm.kalkulator

// Kelas Calculator digunakan untuk melakukan operasi matematika dasar.
class Calculator {

    // Fungsi untuk menambahkan dua bilangan bulat.
    fun add(a: Int, b: Int): Int {
        return a + b
    }

    // Fungsi untuk mengurangkan dua bilangan bulat.
    fun subtract(a: Int, b: Int): Int {
        return a - b
    }

    // Fungsi untuk mengalikan dua bilangan bulat.
    fun multiply(a: Int, b: Int): Int {
        return a * b
    }

    // Fungsi untuk membagi dua bilangan bulat.
    // Jika pembagi adalah nol, fungsi ini akan melempar IllegalArgumentException.
    fun divide(a: Int, b: Int): Int {
        if (b == 0) {
            throw IllegalArgumentException("Cannot divide by zero")
        }
        return a / b
    }
}
