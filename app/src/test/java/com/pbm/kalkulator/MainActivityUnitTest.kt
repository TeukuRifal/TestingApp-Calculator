package com.pbm.kalkulator

import org.junit.Test
import org.junit.Assert.*

class MainActivityUnitTest {

    private val calculator = Calculator()

    @Test
    fun addition_isCorrect() {
        // Act
        val result = calculator.add(2, 2)

        // Assert
        assertEquals(4, result)
    }

    @Test
    fun subtraction_isCorrect() {
        // Act
        val result = calculator.subtract(4, 2)

        // Assert
        assertEquals(2, result)
    }

    @Test
    fun multiplication_isCorrect() {
        // Act
        val result = calculator.multiply(3, 2)

        // Assert
        assertEquals(6, result)
    }

    @Test
    fun division_isCorrect() {
        // Act
        val result = calculator.divide(6, 3)

        // Assert
        assertEquals(2, result)
    }

    @Test(expected = IllegalArgumentException::class)
    fun division_byZero_throwsException() {
        // Act
        calculator.divide(6, 0)
    }
}
