package gray.dev.droidutililty

import android.content.Context
import android.content.SharedPreferences

open class PreferenceConnector {

    companion object {
        private const val PREF_NAME = "util"
        private const val MODE = Context.MODE_PRIVATE

        @JvmStatic
        fun deleteString(context: Context, key: String) {
            getEditor(context).remove(key).commit()
        }

        @JvmStatic
        fun writeBoolean(context: Context, key: String, value: Boolean) {
            getEditor(context).putBoolean(key, value).commit()
        }

        @JvmStatic
        fun readBoolean(context: Context, key: String, defValue: Boolean): Boolean {
            return getPreferences(context).getBoolean(key, defValue)
        }

        @JvmStatic
        fun writeInteger(context: Context, key: String, value: Int) {
            getEditor(context).putInt(key, value).commit()

        }

        @JvmStatic
        fun readInteger(context: Context, key: String, defValue: Int): Int {
            return getPreferences(context).getInt(key, defValue)
        }

        @JvmStatic
        fun writeString(context: Context, key: String, value: String) {
            getEditor(context).putString(key, value).commit()

        }

        @JvmStatic
        fun readString(context: Context, key: String, defValue: String): String {
            return getPreferences(context).getString(key, defValue)
        }

        @JvmStatic
        fun writeFloat(context: Context, key: String, value: Float) {
            getEditor(context).putFloat(key, value).commit()
        }

        @JvmStatic
        fun readFloat(context: Context, key: String, defValue: Float): Float {
            return getPreferences(context).getFloat(key, defValue)
        }

        @JvmStatic
        fun writeLong(context: Context, key: String, value: Long) {
            getEditor(context).putLong(key, value).commit()
        }

        @JvmStatic
        fun readLong(context: Context, key: String, defValue: Long): Long {
            return getPreferences(context).getLong(key, defValue)
        }

        @JvmStatic
        fun getPreferences(context: Context): SharedPreferences {
            return context.getSharedPreferences(PREF_NAME, MODE)
        }

        @JvmStatic
        fun getEditor(context: Context): SharedPreferences.Editor {
            return getPreferences(context).edit()
        }
    }
}