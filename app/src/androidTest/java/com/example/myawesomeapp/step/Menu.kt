package com.example.myawesomeapp.step

import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import com.example.myawesomeapp.element.MainScreenElement

class MainScreenStep {
    private val mainElement = MainScreenElement()

    fun checkMainScreenTextIsDisplayed() {
        mainElement
            .mainScreenText()
            .check(matches(isDisplayed()))
    }
}
