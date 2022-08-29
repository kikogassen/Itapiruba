package com.android.itapiruba.foundation.navigation.deeplink

import android.net.Uri

sealed interface DeepLink {
    val uri: Uri
}
