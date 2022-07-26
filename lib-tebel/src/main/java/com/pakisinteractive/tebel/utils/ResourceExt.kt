package com.pakisinteractive.tebel.utils

import android.content.res.Resources
import android.content.res.TypedArray

val Int.dp: Int get() = (this * Resources.getSystem().displayMetrics.density + 0.5f).toInt()

inline fun <reified T : Enum<T>> TypedArray.getEnum(index: Int, default: T) =
    getInt(index, -1).let {
        if (it >= 0) enumValues<T>()[it] else default
    }