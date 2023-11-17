package com.dede.android_eggs.views.main.compose

import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.ProvidableCompositionLocal
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.platform.LocalInspectionMode
import androidx.fragment.app.FragmentManager
import com.dede.android_eggs.views.main.EasterEggLogoSensorMatrixConvert

private inline fun noLocalProvidedFor(name: String): Nothing {
    throw IllegalStateException("CompositionLocal %s not present".format(name))
}

val <T> ProvidableCompositionLocal<T>.currentOutInspectionMode: T?
    @ReadOnlyComposable
    @Composable
    get() = if (LocalInspectionMode.current) null else current

val LocalFragmentManager = staticCompositionLocalOf<FragmentManager> {
    noLocalProvidedFor("LocalFragmentManager")
}

val LocalEasterEggLogoSensor = staticCompositionLocalOf<EasterEggLogoSensorMatrixConvert> {
    noLocalProvidedFor("LocalEasterEggLogoSensor")
}

val LocalKonfettiState = staticCompositionLocalOf<MutableState<Boolean>> {
    noLocalProvidedFor("LocalKonfettiState")
}

