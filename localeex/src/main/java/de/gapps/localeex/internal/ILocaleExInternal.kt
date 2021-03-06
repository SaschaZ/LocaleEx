package de.gapps.localeex.internal

import android.content.Context
import android.content.res.Configuration
import de.gapps.localeex.preferences.ILocaleExPreferences
import java.util.*

interface ILocaleExInternal : ILocaleExPreferences {

    /**
     * Returns the [Locale] which was set with [applyLocale].
     */
    override val Context.storedLocale: Locale

    /**
     * Restores the last [Locale] which was set with [applyLocale] in the [Context].
     *
     * @return [Context] with the restored [Locale]
     */
    fun Context.restoreLocale(): Context

    /**
     * Applies the provided [Locale] to the [Context].
     *
     * @return [Context] with the applied [Locale]
     */
    fun Context.applyLocale(locale: Locale): Context

    /**
     * Updates the [Configuration] with the last [Locale] which was set in [applyLocale].
     *
     * @return [Configuration] updated with last [Locale]
     */
    fun Context.updateConfiguration(config: Configuration): Configuration
}