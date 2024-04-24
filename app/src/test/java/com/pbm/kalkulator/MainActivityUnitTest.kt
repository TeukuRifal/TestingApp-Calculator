package com.pbm.kalkulator

import org.junit.Test
import org.junit.Assert.*

class MainActivityUnitTest {

    // Membuat instance dari kelas Calculator untuk pengujian
    private val calculator = Calculator()

    // Unit test untuk fungsi penambahan
    @Test
    fun addition_isCorrect() {
        // Act: Memanggil fungsi add dengan operand 2 dan 2
        val result = calculator.add(2, 2)

        // Assert: Memeriksa apakah hasilnya adalah 4
        assertEquals(4, result)
    }

    // Unit test untuk fungsi pengurangan
    @Test
    fun subtraction_isCorrect() {
        // Act: Memanggil fungsi subtract dengan operand 4 dan 2
        val result = calculator.subtract(4, 2)

        // Assert: Memeriksa apakah hasilnya adalah 2
        assertEquals(2, result)
    }

    // Unit test untuk fungsi perkalian
    @Test
    fun multiplication_isCorrect() {
        // Act: Memanggil fungsi multiply dengan operand 3 dan 2
        val result = calculator.multiply(3, 2)

        // Assert: Memeriksa apakah hasilnya adalah 6
        assertEquals(6, result)
    }

    // Unit test untuk fungsi pembagian
    @Test
    fun division_isCorrect() {
        // Act: Memanggil fungsi divide dengan operand 6 dan 3
        val result = calculator.divide(6, 3)

        // Assert: Memeriksa apakah hasilnya adalah 2
        assertEquals(2, result)
    }

    // Unit test untuk memastikan bahwa pembagian dengan nol akan menyebabkan pengecualian
    @Test(expected = IllegalArgumentException::class)
    fun division_byZero_throwsException() {
        // Act: Memanggil fungsi divide dengan operand 6 dan 0
        calculator.divide(6, 0)
    }
}
