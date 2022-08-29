package com.finvibe.android.foundation.core.extensions

import com.android.itapiruba.foundation.core.constants.IntConstants

fun Int?.orZero(): Int = this ?: IntConstants.ZERO