plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("androidx.navigation.safeargs")
    id("dagger.hilt.android.plugin")
    id ("kotlinx-serialization")
    kotlin("kapt")
}

// Allow references to generated code
kapt {
    correctErrorTypes = true
}

android {
    compileSdk = AppConfig.compileSdk

    defaultConfig {
        applicationId = "com.hb.aparatviewer"
        minSdk = AppConfig.minSdk
        targetSdk = AppConfig.targetSdk
        versionCode = AppConfig.versionCode
        versionName = AppConfig.versionName

        testInstrumentationRunner = AppConfig.androidTestInstrumentation
        buildConfigField("String", "BASE_URL", "\"https://www.aparat.com/etc/\"")
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = true
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures.dataBinding = true
}

dependencies {
    //std lib
    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))

    //app libs
    implementation(Dependencies.appLibraries)

    kapt(Dependencies.kapt)

    annotationProcessor(Dependencies.roomCompiler)

    //test libs
    testImplementation(Dependencies.testLibraries)
    androidTestImplementation(Dependencies.androidTestLibraries)
}