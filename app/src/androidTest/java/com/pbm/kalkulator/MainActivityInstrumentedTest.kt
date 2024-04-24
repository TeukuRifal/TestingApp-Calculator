package com.pbm.kalkulator

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.rule.ActivityTestRule
import org.junit.Rule
import org.junit.Test
import org.junit.matchers.JUnitMatchers.containsString
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class MainActivityInstrumentedTest {

    @get:Rule
    val activityRule = ActivityTestRule(MainActivity::class.java)

    @Test
    fun testButtonClick() {
        // Mengklik tombol 1
        onView(withId(R.id.button1)).perform(click())

        // Mengklik tombol tambah
        onView(withId(R.id.buttonPlus)).perform(click())

        // Mengklik tombol 2
        onView(withId(R.id.button2)).perform(click())

        // Mengklik tombol sama dengan
        onView(withId(R.id.buttonEquals)).perform(click())

        // Memeriksa apakah teks yang ditampilkan mengandung nilai yang diharapkan
        onView(withId(R.id.resultTextView))
            .check(matches(withText(containsString("3"))))
    }
}
