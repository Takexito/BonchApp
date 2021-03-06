package com.example.bonchapp.ui.event

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.bonchapp.R

class EventFragment : Fragment() {

    private lateinit var eventViewModel: EventViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        eventViewModel =
            ViewModelProviders.of(this).get(EventViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_event, container, false)
        val textView: TextView = root.findViewById(R.id.text_event)
        eventViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }
}
