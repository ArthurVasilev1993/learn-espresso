package com.example.myawesomeapp.step

import androidx.test.espresso.action.ViewActions.swipeRight
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import com.example.myawesomeapp.element.NotificationElement

class Notification {
    private val notificationElement = NotificationElement()

    fun checkGalleryNotificationTextIsDisplayed(position: String) {
        notificationElement
            .notificationText("Item #" + position + " clicked successfully!")
            .check(
                matches(isDisplayed()),
            )
    }

    fun swipeGalleryNotificationPopup() {
        notificationElement
            .notificationPopup()
            .perform(swipeRight())
    }
}
