package com.android.itapiruba.foundation.core_android.utils

import kotlinx.coroutines.flow.StateFlow

interface ViewStateHolder<T> {
    val viewState: StateFlow<T>
}
