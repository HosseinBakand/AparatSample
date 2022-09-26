object TempVersions {
    const val crashlyticsPlugin = "2.9.1"
    const val detekt = "1.21.0"
    const val gradleTools = "7.1.3"
    const val kotlinSdk = "1.7.0"
    const val googleService = "4.3.13"

    const val accompanist = "0.25.1"
    const val activity = "1.5.1"
    const val browserHelper = "1.4.0"
    const val coil = "1.4.0"
    const val core = "1.8.0"
    const val coroutines = "1.6.4"
    const val datastore = "1.0.0"
    const val exoplayer = "2.18.0"
    const val firebaseBoM = "30.3.1"
    const val formManager = "2.0.0-rc01"
    const val hilt = "2.43.1"
    const val hiltWork = "1.0.0"
    const val hiltNavigation = "1.0.0"
    const val lifecycle = "2.5.1"
    const val okHttp = "4.9.3"
    const val poolAKey = "2.0.0"
    const val retrofit = "2.9.0"
    const val room = "2.4.3"
    const val security = "1.1.0-alpha03"
    const val serialization = "1.3.3"
    const val serializationConverter = "0.8.0"
    const val sqlcipher = "4.5.1"
    const val ssp = "1.0.6"
    const val startup = "1.1.1"
    const val timber = "5.0.1"
    const val workManager = "2.7.1"
    const val epoxy = "5.0.0-beta03"
    const val material = "1.6.0"
    const val Sdp = "1.0.6"
    const val vicoCharts = "1.3.0"

    // TestLibraries
    const val arch = "2.1.0"
    const val junit = "4.13.2"
    const val mockk = "1.12.4"
    const val robolectric = "4.6.1"
    const val turbine = "0.8.0"
    const val androidTest = "1.4.0"
}

object TempPlugins {
    const val Crashlytics =
        "com.google.firebase:firebase-crashlytics-gradle:${TempVersions.crashlyticsPlugin}"
    const val Detekt = "io.gitlab.arturbosch.detekt"
    const val DetektFormatting =
        "io.gitlab.arturbosch.detekt:detekt-formatting:${TempVersions.detekt}"
    const val GoogleService = "com.google.gms:google-services:${TempVersions.googleService}"
    const val GradleTools = "com.android.tools.build:gradle:${TempVersions.gradleTools}"
    const val Hilt = "com.google.dagger:hilt-android-gradle-plugin:${TempVersions.hilt}"
    const val KotlinSdk = "org.jetbrains.kotlin:kotlin-gradle-plugin:${TempVersions.kotlinSdk}"
    const val KotlinSerialization =
        "org.jetbrains.kotlin:kotlin-serialization:${TempVersions.kotlinSdk}"
}

object TempLibraries {
    const val AccompanistFlowLayout =
        "com.google.accompanist:accompanist-flowlayout:${TempVersions.accompanist}"
    const val AccompanistNavigation =
        "com.google.accompanist:accompanist-navigation-material:${TempVersions.accompanist}"
    const val AccompanistNavigationAnimation =
        "com.google.accompanist:accompanist-navigation-animation:${TempVersions.accompanist}"
    const val AccompanistPager =
        "com.google.accompanist:accompanist-pager:${TempVersions.accompanist}"
    const val AccompanistPagerIndicator =
        "com.google.accompanist:accompanist-pager-indicators:${TempVersions.accompanist}"
    const val AccompanistWebView =
        "com.google.accompanist:accompanist-webview:${TempVersions.accompanist}"
    const val AccompanistSystemUiController =
        "com.google.accompanist:accompanist-systemuicontroller:${TempVersions.accompanist}"
    const val Activity = "androidx.activity:activity-compose:${TempVersions.activity}"
    const val BrowserHelper =
        "com.google.androidbrowserhelper:androidbrowserhelper:${TempVersions.browserHelper}"
    const val Coil = "io.coil-kt:coil-compose:${TempVersions.coil}"
    const val CoreKtx = "androidx.core:core-ktx:${TempVersions.core}"
    const val CoroutinesAndroid =
        "org.jetbrains.kotlinx:kotlinx-coroutines-android:${TempVersions.coroutines}"
    const val CoroutinesCore =
        "org.jetbrains.kotlinx:kotlinx-coroutines-core:${TempVersions.coroutines}"
    const val Datastore = "androidx.datastore:datastore-preferences:${TempVersions.datastore}"
    const val Epoxy = "com.airbnb.android:epoxy:${TempVersions.epoxy}"
    const val EpoxyProcessor = "com.airbnb.android:epoxy-processor:${TempVersions.epoxy}"
    const val ExoPlayerCore =
        "com.google.android.exoplayer:exoplayer-core:${TempVersions.exoplayer}"
    const val ExoPlayerUI = "com.google.android.exoplayer:exoplayer-ui:${TempVersions.exoplayer}"
    const val FirebaseBoM = "com.google.firebase:firebase-bom:${TempVersions.firebaseBoM}"
    const val FirebaseAnalytics = "com.google.firebase:firebase-analytics-ktx"
    const val FirebaseCrashlytics = "com.google.firebase:firebase-crashlytics-ktx"
    const val FirebaseMassaging = "com.google.firebase:firebase-messaging-ktx"
    const val FormManager = "com.partsoftware.formmanager:compose:${TempVersions.formManager}"
    const val Hilt = "com.google.dagger:hilt-android:${TempVersions.hilt}"
    const val HiltNavigation =
        "androidx.hilt:hilt-navigation-compose:${TempVersions.hiltNavigation}"
    const val HiltCompiler = "com.google.dagger:hilt-android-compiler:${TempVersions.hilt}"
    const val HiltTest = "com.google.dagger:hilt-android-testing:${TempVersions.hilt}"
    const val HiltWork = "androidx.hilt:hilt-work:${TempVersions.hiltWork}"
    const val HiltWorkCompiler = "androidx.hilt:hilt-compiler:${TempVersions.hiltWork}"
    const val LifecycleViewModel =
        "androidx.lifecycle:lifecycle-viewmodel-compose:${TempVersions.lifecycle}"
    const val Material = "com.google.android.material:material:${TempVersions.material}"
    const val OkHttp = "com.squareup.okhttp3:okhttp:${TempVersions.okHttp}"
    const val OkHttpLogger = "com.squareup.okhttp3:logging-interceptor:${TempVersions.okHttp}"
    const val PoolAKey = "com.github.cafebazaar.Poolakey:poolakey:${TempVersions.poolAKey}"
    const val Retrofit = "com.squareup.retrofit2:retrofit:${TempVersions.retrofit}"
    const val Room = "androidx.room:room-ktx:${TempVersions.room}"
    const val RoomCompiler = "androidx.room:room-compiler:${TempVersions.room}"
    const val RoomCommon = "androidx.room:room-common:${TempVersions.room}"
    const val Security = "androidx.security:security-crypto:${TempVersions.security}"
    const val Serialization =
        "org.jetbrains.kotlinx:kotlinx-serialization-json:${TempVersions.serialization}"
    const val SerializationConverter =
        "com.jakewharton.retrofit:retrofit2-kotlinx-serialization-converter:${TempVersions.serializationConverter}"
    const val Sqlcipher = "net.zetetic:android-database-sqlcipher:${TempVersions.sqlcipher}"
    const val Ssp = "com.intuit.ssp:ssp-android:${TempVersions.ssp}"
    const val Startup = "androidx.startup:startup-runtime:${TempVersions.startup}"
    const val Sdp = "com.intuit.sdp:sdp-android:${TempVersions.Sdp}"
    const val Timber = "com.jakewharton.timber:timber:${TempVersions.timber}"
    const val WorkManager = "androidx.work:work-runtime-ktx:${TempVersions.workManager}"
    const val WorkManagerTest = "androidx.work:work-testing:${TempVersions.workManager}"
    const val vicoChartsCompose = "com.patrykandpatryk.vico:compose:${TempVersions.vicoCharts}"

    val list = arrayListOf(
        AccompanistFlowLayout,
        AccompanistNavigation,
        AccompanistNavigationAnimation,
        AccompanistPager,
        AccompanistPagerIndicator,
        AccompanistWebView,
        AccompanistSystemUiController,
        Activity,
        BrowserHelper,
        Coil,
        CoreKtx,
        CoroutinesAndroid,
        CoroutinesCore,
        Datastore,
        Epoxy,
        EpoxyProcessor,
        ExoPlayerCore,
        ExoPlayerUI,
        FirebaseBoM,
        FirebaseAnalytics,
        FirebaseCrashlytics,
        FirebaseMassaging,
        FormManager,
        Hilt,
        HiltNavigation,
        HiltCompiler,
        HiltTest,
        HiltWork,
        HiltWorkCompiler,
        LifecycleViewModel,
        Material,
        OkHttp,
        OkHttpLogger,
        PoolAKey,
        Retrofit,
        Room,
        RoomCompiler,
        RoomCommon,
        Security,
        Serialization,
        SerializationConverter,
        Sqlcipher,
        Ssp,
        Startup,
        Sdp,
        Timber,
        WorkManager,
        WorkManagerTest,
        vicoChartsCompose,
    )

}

object TestLibraries {
    const val Arch = "androidx.arch.core:core-testing:${TempVersions.arch}"
    const val CoroutinesTest =
        "org.jetbrains.kotlinx:kotlinx-coroutines-test:${TempVersions.coroutines}"
    const val Junit = "junit:junit:${TempVersions.junit}"
    const val Mockk = "io.mockk:mockk:${TempVersions.mockk}"
    const val MockkAndroid = "io.mockk:mockk-android:${TempVersions.mockk}"
    const val Robolectric = "org.robolectric:robolectric:${TempVersions.robolectric}"
    const val Turbine = "app.cash.turbine:turbine:${TempVersions.turbine}"
    const val AndroidTestCore = "androidx.test:core:${TempVersions.androidTest}"
    const val AndroidTestRunner = "androidx.test:runner:${TempVersions.androidTest}"
    const val RoomTesting = "androidx.room:room-testing:${TempVersions.room}"
}
