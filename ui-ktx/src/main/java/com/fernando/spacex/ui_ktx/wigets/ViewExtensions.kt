package com.fernando.spacex.ui_ktx.wigets

import android.view.View

infix fun View.click(click: () -> Unit) {
    setOnClickListener { click() }
}