package com.android.itapiruba.foundation.core.extensions

import com.android.itapiruba.foundation.core.constants.DoubleConstants

fun Double?.orZero(): Double = this ?: DoubleConstants.ZERO