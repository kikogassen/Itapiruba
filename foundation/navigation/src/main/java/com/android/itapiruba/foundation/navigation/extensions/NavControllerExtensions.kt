package com.android.itapiruba.foundation.navigation.extensions

import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleEventObserver
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.Observer
import androidx.navigation.NavController
import androidx.navigation.NavOptions
import androidx.navigation.navOptions
import androidx.navigation.ui.R
import com.android.itapiruba.foundation.monitoring.record
import com.android.itapiruba.foundation.navigation.deeplink.DeepLink

fun NavController.navigateToDeepLink(
    deepLink: DeepLink,
    navOptions: NavOptions =
        navOptions {
            anim {
                enter = R.anim.nav_default_enter_anim
                exit = R.anim.nav_default_exit_anim
                popEnter = R.anim.nav_default_pop_enter_anim
                popExit = R.anim.nav_default_pop_exit_anim
            }
        }
) {
    try {
        if (graph.hasDeepLink(deepLink.uri)) navigate(deepLink.uri, navOptions)
    } catch (exception: IllegalStateException) {
        exception.record()
    } catch (exception: IllegalArgumentException) {
        exception.record()
    }
}

fun <T> NavController.observeResult(
    lifecycleOwner: LifecycleOwner,
    key: String,
    observer: Observer<T>
) {
    val savedStateHandle = currentBackStackEntry?.savedStateHandle

    savedStateHandle?.getLiveData<T>(key)?.observe(lifecycleOwner, observer)

    lifecycleOwner.lifecycle.addObserver(LifecycleEventObserver { _, event ->
        if (event == Lifecycle.Event.ON_DESTROY) {
            savedStateHandle?.remove<T>(key)
        }
    })
}

fun <T> NavController.setResult(key: String, result: T) {
    previousBackStackEntry?.savedStateHandle?.set(key, result)
}
