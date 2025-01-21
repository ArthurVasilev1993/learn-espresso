package com.example.myawesomeapp.step

import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import com.example.myawesomeapp.element.ToolbarElement

class Toolbar {
    private val toolbarElement = ToolbarElement()

    fun clickToolbarMenuButton() {
        toolbarElement
            .toolbarMenuButton()
            .perform(click())
    }

    fun checkCurrentScreenToolbarIsDisplayed(screen: String) {
        toolbarElement
            .toolbarMenuButton()
            .check(matches(isDisplayed()))
        toolbarElement
            .toolbarMenuHeading(screen)
            .check(matches(isDisplayed()))
        toolbarElement
            .toolbarMenuOptionsButton()
            .check(matches(isDisplayed()))
    }
}
