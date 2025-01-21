package com.example.myawesomeapp.element

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.ViewInteraction
import androidx.test.espresso.matcher.ViewMatchers.hasSibling
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import com.example.myawesomeapp.R
import org.hamcrest.core.AllOf.allOf

class GalleryElement {
    fun galleryRecycleView(): ViewInteraction = onView(withId(R.id.recycle_view))

    fun galleryItemList(position: String): ViewInteraction =
        onView(
            allOf(
                withId(R.id.item_title),
                hasSibling(
                    allOf(
                        withText(position),
                        withId(R.id.item_number),
                    ),
                ),
            ),
        )
}
