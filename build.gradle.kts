// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
    repositories {

//        maven ( url ="https://maven.neshan.org/artifactory/public-maven" )
        google()
        mavenCentral()
        mavenLocal()
    }
    dependencies {
        classpath("com.android.tools.build:gradle:7.2.2")
        classpath ("org.jetbrains.kotlin:kotlin-gradle-plugin:1.7.10")
        classpath("com.google.dagger:hilt-android-gradle-plugin:${Versions.hilt}")
        classpath("androidx.navigation:navigation-safe-args-gradle-plugin:${Versions.navigation}")
        classpath("androidx.navigation:navigation-safe-args-gradle-plugin:${Versions.navigation}")
        val kotlinVersion = "1.7.10"
        classpath(kotlin("gradle-plugin", version = kotlinVersion))
        classpath(kotlin("serialization", version = kotlinVersion))
//        classpath(kotlin("serialization", version= Versions.kotlin))
    }
}


tasks.register("clean",Delete::class ){
    delete(rootProject.buildDir)
}
