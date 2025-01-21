package com.example.myawesomeapp.step

import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.swipeUp
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import com.example.myawesomeapp.element.GalleryElement

class Gallery {
    private val galleryElement = GalleryElement()

    fun checkGalleryRecycleViewIsDisplayed() {
        Thread.sleep(1000)
        galleryElement
            .galleryRecycleView()
            .check(matches(isDisplayed()))
    }

    fun clickGalleryItemListFirstPosition() {
        galleryElement
            .galleryItemList("1")
            .check(matches(isDisplayed()))
            .perform(click())
    }

    fun clickGalleryItemListTenthPosition() {
        galleryElement
            .galleryItemList("10")
            .check(matches(isDisplayed()))
            .perform(click())
    }

    fun swipeGalleryRecycleView() {
        galleryElement
            .galleryRecycleView()
            .check(matches(isDisplayed()))
            .perform(swipeUp())
    }
}
