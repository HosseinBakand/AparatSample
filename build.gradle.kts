// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
    repositories {
        google()
        mavenCentral()
        mavenLocal()
    }
    dependencies {
        classpath("com.android.tools.build:gradle:7.2.2")
        classpath ("org.jetbrains.kotlin:kotlin-gradle-plugin:1.7.10")
        classpath("com.google.dagger:hilt-android-gradle-plugin:2.43.1")
        classpath("androidx.navigation:navigation-safe-args-gradle-plugin:${Versions.nav_version}")
    }
}


tasks.register("clean",Delete::class ){
    delete(rootProject.buildDir)
}
