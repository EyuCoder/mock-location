package com.codexo.mocklocation

import android.content.Context

class PrefsManager(private val context: Context) {
    companion object {
        private const val PREFS_NAME = "MockedLocation"
        private const val LOCATION_MARKER = "locationMarker"
    }

    private val preferences = context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)

    fun saveLocation(location: String) {
        preferences
            .edit()
            .putString(LOCATION_MARKER, location)
            .apply()
    }

    fun getLocation(): String? {
        if (preferences.contains(LOCATION_MARKER)) {
            return preferences.getString(LOCATION_MARKER, null)
        }
        return null
    }
}