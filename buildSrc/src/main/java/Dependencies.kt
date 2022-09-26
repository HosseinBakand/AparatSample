import org.gradle.api.artifacts.dsl.DependencyHandler

object Dependencies {

    //std lib
    private const val kotlinStdLib = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.kotlin}"

    //android ui
    private const val appcompat = "androidx.appcompat:appcompat:${Versions.appcompat}"
    private const val coreKtx = "androidx.core:core-ktx:${Versions.coreKtx}"
    private const val constraintLayout =
        "androidx.constraintlayout:constraintlayout:${Versions.constraintLayout}"
    private const val material = "com.google.android.material:material:${Versions.material}"
    private const val lifecycleLivedata =  "androidx.lifecycle:lifecycle-livedata-ktx:${Versions.lifecycle}"
    private const val lifecycleViewModel = "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.lifecycle}"
    private const val legacy = "androidx.legacy:legacy-support-v4:${Versions.legacy}"
    private const val recyclerview = "androidx.recyclerview:recyclerview:${Versions.recyclerview}"

    //navigation
    private const val navigationFragment = "androidx.navigation:navigation-fragment-ktx:${Versions.navigation}"
    private const val navigationUi = "androidx.navigation:navigation-ui-ktx:${Versions.navigation}"

    //hilt
    private const val hilt = "com.google.dagger:hilt-android:${Versions.hilt}"
    private const val hiltCompilerKapt = "com.google.dagger:hilt-android-compiler:${Versions.hilt}"

    //retrofit
    private const val retrofit ="com.squareup.retrofit2:retrofit:${Versions.retrofit}"
    private const val retrofitConverterGson ="com.squareup.retrofit2:converter-gson:${Versions.retrofit}"
    private const val okhttp3LoggingInterceptor ="com.squareup.okhttp3:logging-interceptor:${Versions.okhttp3}"
    private const val kotlinSerialization ="org.jetbrains.kotlinx:kotlinx-serialization-json:${Versions.kotlin}"
    private const val kotlinSerializationConverter = "com.jakewharton.retrofit:retrofit2-kotlinx-serialization-converter:${Versions.kotlinSerializationConverter}"

    //test libs
    private const val junit = "junit:junit:${Versions.junit}"
    private const val extJUnit = "androidx.test.ext:junit:${Versions.extJunit}"
    private const val espressoCore = "androidx.test.espresso:espresso-core:${Versions.espresso}"
    private const val navigationTesting = "\"androidx.navigation:navigation-testing:${Versions.navigation}"

    val appLibraries = arrayListOf<String>().apply {
        add(kotlinStdLib)
        add(coreKtx)
        add(appcompat)
        add(constraintLayout)
        add(material)
        add(lifecycleLivedata)
        add(lifecycleViewModel)
        add(hilt)
        add(recyclerview)
        add(legacy)
        add(navigationFragment)
        add(navigationUi)
        add(retrofit)
        add(retrofitConverterGson)
        add(okhttp3LoggingInterceptor)
        add(kotlinSerialization)
        add(kotlinSerializationConverter)
    }

    val androidTestLibraries = arrayListOf<String>().apply {
        add(extJUnit)
        add(espressoCore)
//        add(navigationTesting)
    }

    val testLibraries = arrayListOf<String>().apply {
        add(junit)
    }

    val kapt = arrayListOf<String>().apply {
        add(hiltCompilerKapt)
    }
}

//util functions for adding the different type dependencies from build.gradle file
fun DependencyHandler.kapt(list: List<String>) {
    list.forEach { dependency ->
        add("kapt", dependency)
    }
}

fun DependencyHandler.implementation(list: List<String>) {
    list.forEach { dependency ->
        add("implementation", dependency)
    }
}

fun DependencyHandler.androidTestImplementation(list: List<String>) {
    list.forEach { dependency ->
        add("androidTestImplementation", dependency)
    }
}

fun DependencyHandler.testImplementation(list: List<String>) {
    list.forEach { dependency ->
        add("testImplementation", dependency)
    }
}
