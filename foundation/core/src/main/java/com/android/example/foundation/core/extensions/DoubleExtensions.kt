package com.android.example.foundation.core.extensions

import com.android.example.foundation.core.constants.DoubleConstants

fun Double?.orZero(): Double = this ?: DoubleConstants.ZERO