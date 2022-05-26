plugins {
    id("com.android.application")
    kotlin("android")
}

android {
    compileSdk = 31
    defaultConfig {
        applicationId = "com.dispy.kmmdemo.android"
        minSdk = 21
        targetSdk = 31
        versionCode = 1
        versionName = "1.0"
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
    }
    namespace = "com.dispy.kmmdemo.android"
}

dependencies {
    implementation(project(":shared"))
    implementation("com.google.android.material:material:1.4.0")
    implementation("androidx.appcompat:appcompat:1.3.1")
    implementation("androidx.constraintlayout:constraintlayout:2.1.0")
    implementation(Develop.Ktor.androidCore)
    implementation(Develop.Coroutines.common)
    implementation(Develop.Coroutines.android)
    implementation(Develop.AndroidX.lifecycle_runtime)
    implementation(Develop.AndroidX.lifecycle_viewmodel)
    implementation(Develop.AndroidX.lifecycle_viewmodel_extensions)
}