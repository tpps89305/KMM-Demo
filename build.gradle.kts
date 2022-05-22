buildscript {
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
    }
    dependencies {
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.6.20-M1")
        classpath("com.android.tools.build:gradle:7.1.2")
        val serializationVersion = "1.5.21"
        classpath("org.jetbrains.kotlin:kotlin-serialization:$serializationVersion")
    }
}

allprojects {
    repositories {
        google()
        mavenCentral()
    }
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}