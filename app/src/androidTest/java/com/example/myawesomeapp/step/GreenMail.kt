package com.example.myawesomeapp.step

import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.swipeRight
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import com.example.myawesomeapp.element.GreenMailButton

class GreenMail {
    private val fabElement = GreenMailButton()

    fun checkGreenMailIsDisplayed() {
        fabElement
            .fab()
            .check(matches(isDisplayed()))
    }

    fun clickGreenMail() {
        fabElement
            .fab()
            .perform(click())
    }

    fun checkGreenMailNotificationIsDisplayed() {
        fabElement
            .fabNotification()
            .check(matches(isDisplayed()))
    }

    fun swipeGreenMailNotification() {
        fabElement
            .fabNotification()
            .perform(swipeRight())
    }
}
