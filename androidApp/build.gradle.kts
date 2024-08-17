plugins {
    id("com.android.application")
    kotlin("android")
}

android {
    compileSdk = libs.versions.android.compileSdk.get().toInt()
    defaultConfig {
        applicationId = "com.dispy.kmmdemo.android"
        minSdk = libs.versions.android.minSdk.get().toInt()
        versionCode = 1
        versionName = "1.0"
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    namespace = "com.dispy.kmmdemo.android"
}

dependencies {
    implementation(project(":shared"))
    implementation(libs.material)
    implementation(libs.appcompat)
    implementation(libs.constraintlayout)
    implementation(libs.ktor.client.okhttp)
    implementation(libs.kotlinx.coroutines.core)
    implementation(libs.kotlinx.coroutines.android)
    implementation(libs.lifecycle.runtime.ktx)
    implementation(libs.lifecycle.viewmodel)
    implementation(libs.lifecycle.viewmodel.ktx)
}