package com.example.bonchapp.ui.event

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.view.ContextThemeWrapper
import androidx.fragment.app.Fragment
import com.example.bonchapp.R


class FullEventFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val contextThemeWrapper: Context =
            ContextThemeWrapper(activity, R.style.AppTheme_NoActionBar)
        val localInflater = inflater.cloneInContext(contextThemeWrapper)
        (activity as AppCompatActivity).supportActionBar?.hide()
        return localInflater.inflate(R.layout.fragment_full_event, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }
}