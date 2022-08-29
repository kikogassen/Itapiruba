package com.android.example.foundation.core.extensions

import com.android.example.foundation.core.constants.IntConstants

fun Int?.orZero(): Int = this ?: IntConstants.ZERO