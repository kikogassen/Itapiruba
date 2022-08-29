package com.android.example.foundation.core_android.utils

import kotlinx.coroutines.flow.StateFlow

interface ViewStateHolder<T> {
    val viewState: StateFlow<T>
}
