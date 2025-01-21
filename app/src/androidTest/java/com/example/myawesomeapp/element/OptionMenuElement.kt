package com.example.myawesomeapp.element

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.ViewInteraction
import androidx.test.espresso.matcher.ViewMatchers.isDescendantOfA
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import com.example.myawesomeapp.R
import org.hamcrest.core.AllOf.allOf

class MenuElement {
    fun menuImageView(): ViewInteraction = onView(withId(R.id.imageView))

    fun menuName(): ViewInteraction {
        return onView(withText("Android Studio"))
    }

    fun menuEmail(): ViewInteraction = onView(withText("android.studio@android.com"))

    fun menuHomeButton(): ViewInteraction =
        onView(
            allOf(
                withText("Home"),
                isDescendantOfA(withId(R.id.nav_home)),
            ),
        )

    fun menuGalleryButton(): ViewInteraction =
        onView(
            allOf(
                withText("Gallery"),
                isDescendantOfA(withId(R.id.nav_gallery)),
            ),
        )

    fun menuSlideshowButton(): ViewInteraction =
        onView(
            allOf(
                withText("Slideshow"),
                isDescendantOfA(withId(R.id.nav_slideshow)),
            ),
        )
}
