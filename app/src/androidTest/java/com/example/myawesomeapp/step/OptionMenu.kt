package com.example.myawesomeapp.step

import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isChecked
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import com.example.myawesomeapp.element.MenuElement

class MenuStep {
    private val menuElement = MenuElement()

    fun checkMenuImageViewIsDisplayed() {
        menuElement
            .menuImageView()
            .check(matches(isDisplayed()))
    }

    fun checkMenuNameIsDisplayed() {
        menuElement
            .menuName()
            .check(matches(isDisplayed()))
    }

    fun checkMenuEmailIsDisplayed() {
        menuElement
            .menuEmail()
            .check(matches(isDisplayed()))
    }

    fun checkMenuHomeButtonIsDisplayed() {
        menuElement
            .menuHomeButton()
            .check(matches(isDisplayed()))
    }

    fun clickMenuHomeButton() {
        menuElement
            .menuHomeButton()
            .perform(click())
    }

    fun checkMenuHomeButtonIsChecked() {
        menuElement
            .menuHomeButton()
            .check(matches(isChecked()))
    }

    fun checkMenuGalleryButtonIsDisplayed() {
        menuElement
            .menuGalleryButton()
            .check(matches(isDisplayed()))
    }

    fun clickMenuGalleryButton() {
        menuElement
            .menuGalleryButton()
            .perform(click())
    }

    fun checkMenuGalleryButtonIsChecked() {
        menuElement
            .menuGalleryButton()
            .check(matches(isChecked()))
    }

    fun checkMenuSlideshowButtonIsDisplayed() {
        menuElement
            .menuSlideshowButton()
            .check(matches(isDisplayed()))
    }

    fun clickMenuSlideshowButton() {
        menuElement
            .menuSlideshowButton()
            .perform(click())
    }

    fun checkMenuSlideshowButtonIsChecked() {
        menuElement
            .menuSlideshowButton()
            .check(matches(isChecked()))
    }
}
