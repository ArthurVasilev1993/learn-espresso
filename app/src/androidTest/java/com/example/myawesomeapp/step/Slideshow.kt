package com.example.myawesomeapp.step

import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import com.example.myawesomeapp.element.SlideshowElement

class Slideshow {
    private val slideshowElement = SlideshowElement()

    fun checkSlideshowScreenTextIsDisplayed() {
        slideshowElement
            .slideshowScreenText()
            .check(matches(isDisplayed()))
    }
}
