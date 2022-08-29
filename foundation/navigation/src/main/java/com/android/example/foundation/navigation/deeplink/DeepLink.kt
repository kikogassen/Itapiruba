package com.android.example.foundation.navigation.deeplink

import android.net.Uri

sealed interface DeepLink {
    val uri: Uri
}
