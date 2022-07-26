package com.pakisinteractive.tebel.utils

import android.content.Context
import androidx.annotation.ColorRes
import androidx.core.content.ContextCompat

fun Context.color(@ColorRes resId: Int): Int {
    return ContextCompat.getColor(this, resId)
}