package com.android.itapiruba.foundation.monitoring

import com.google.firebase.crashlytics.FirebaseCrashlytics

fun Throwable.record() {
    printStackTrace()
    FirebaseCrashlytics.getInstance().recordException(this)
}