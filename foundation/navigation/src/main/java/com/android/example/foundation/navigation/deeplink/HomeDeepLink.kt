package com.android.example.foundation.navigation.deeplink

import android.net.Uri
import com.android.example.foundation.navigation.contract.HomeUriContract
import com.android.example.foundation.navigation.contract.UriContract

object HomeDeepLink : DeepLink {
    override val uri: Uri
        get() = Uri.Builder()
            .scheme(UriContract.SCHEME)
            .authority(HomeUriContract.PATH)
            .build()
}