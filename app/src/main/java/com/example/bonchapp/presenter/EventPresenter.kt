package com.example.bonchapp.presenter

import com.example.bonchapp.model.Event
import com.example.bonchapp.ui.event.EventFragment

class EventPresenter(val context: EventFragment) {

    val data = arrayListOf<Event>(
        Event(),
        Event("title1", "SubTitle1"),
        Event("title2", "SubTitle2"),
        Event("title3", "SubTitle3"),
        Event("title4", "SubTitle4")
    )

    fun onCreate() {
        context.initRecycler(data)
    }
}