package com.example.myawesomeapp.element

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.ViewInteraction
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import com.example.myawesomeapp.R

class GreenMailButton {
    fun fab(): ViewInteraction = onView(withId(R.id.fab))

    fun fabNotification(): ViewInteraction = onView(withText("Replace with your own action"))
}
