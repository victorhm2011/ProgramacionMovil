package edu.bo.treceaba

import android.content.Context
import android.content.SharedPreferences

class Prefs(context: Context) {
    val PREFS_FILENAME = "edu.bo.ucb.pref"
    val KEY_USER ="user"
    val prefs: SharedPreferences = context.getSharedPreferences(PREFS_FILENAME, 0)
    var user: String
        get() = prefs.getString(KEY_USER, null).toString()
        set(value) = prefs.edit().putString(KEY_USER, value).apply()
}
