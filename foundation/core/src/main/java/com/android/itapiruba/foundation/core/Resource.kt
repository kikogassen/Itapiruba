package com.android.itapiruba.foundation.core

sealed class Resource<out T> {
    object Loading : Resource<Nothing>()
    class Success<T>(val data: T) : Resource<T>()
    class Error<T>(val throwable: Throwable) : Resource<T>()
}
