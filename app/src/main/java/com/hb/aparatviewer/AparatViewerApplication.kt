package com.hb.aparatviewer

import android.app.Application
import android.content.Context
import android.content.res.Configuration
import android.os.Build
import android.os.LocaleList
import androidx.annotation.RequiresApi
import dagger.hilt.android.HiltAndroidApp
import java.util.*

@HiltAndroidApp
class AparatViewerApplication : Application(){
    override fun onCreate() {
        super.onCreate()
//        val currentLanguage = "fa"
//        val locale = Locale(currentLanguage)
//        updateResources(this, locale)
//        val appContext = this.applicationContext
//        if (appContext !== this) {
//            updateResources(appContext, locale)
//        }
    }
//
//    private fun updateResources(context: Context, locale: Locale) {
//        Locale.setDefault(locale)
//
//        val res = context.resources
//        val current = res.configuration.getLocaleCompat()
//
//        if (current == locale) return
//
//        val config = Configuration(res.configuration)
//        when {
//            isAtLeastSdkVersion(Build.VERSION_CODES.N) -> setLocaleForApi24(config, locale)
//            isAtLeastSdkVersion(Build.VERSION_CODES.JELLY_BEAN_MR1) -> config.setLocale(locale)
//            else -> config.locale = locale
//        }
//        res.updateConfiguration(config, res.displayMetrics)
//    }
//    fun isAtLeastSdkVersion(versionCode: Int): Boolean {
//        return Build.VERSION.SDK_INT >= versionCode
//    }
//
//    @RequiresApi(Build.VERSION_CODES.N)
//    private fun setLocaleForApi24(config: Configuration, locale: Locale) {
//        // bring the target locale to the front of the list
//        val set = linkedSetOf(locale)
//
//        val defaultLocales = LocaleList.getDefault()
//        val all = List<Locale>(defaultLocales.size()) { defaultLocales[it] }
//        // append other locales supported by the user
//        set.addAll(all)
//
//        config.setLocales(LocaleList(*set.toTypedArray()))
//    }
//
//    @Suppress("DEPRECATION")
//    fun Configuration.getLocaleCompat(): Locale {
//        return if (isAtLeastSdkVersion(Build.VERSION_CODES.N)) locales.get(0) else locale
//    }
}