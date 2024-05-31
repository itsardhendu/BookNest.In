plugins {
    alias(libs.plugins.androidApplication)
    alias(libs.plugins.jetbrainsKotlinAndroid)
}

android {
    namespace = "com.asr.bookstore"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.asr.bookstore"
        minSdk = 28
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro"
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
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.1"
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {
    // Base Compose setup
    implementation(platform(libs.androidx.compose.bom)) // Compose Bill of Materials; manages versions for all Compose libraries
    implementation(libs.androidx.ui) // Core UI components for Compose
    implementation(libs.androidx.ui.graphics) // Compose graphics library
    implementation(libs.androidx.ui.tooling.preview) // Tooling for previewing Compose UIs in IDE
    implementation(libs.androidx.activity.compose) // Integration for Compose with activities

    // Material Design and UI components
    implementation(libs.ui) // Additional UI components
    implementation(libs.androidx.material3) // Material Design 3 components

    // Networking and Serialization
    implementation(libs.retrofit) // HTTP client for Android and Java
    implementation(libs.converter.gson) // Converter for JSON serialization/deserialization with Moshi

    // Kotlin Coroutines for asynchronous programming
    implementation(libs.kotlinx.coroutines.android) // Kotlin Coroutines support for Android

    // Lifecycle-aware components
    implementation(libs.androidx.lifecycle.runtime.ktx) // Lifecycle runtime extensions
    implementation(libs.androidx.lifecycle.viewmodel.compose) // Integration of ViewModel with Compose

    // Navigation component for Compose
    implementation(libs.androidx.navigation.compose) // Navigation library for Compose applications

    // AndroidX core libraries
    implementation(libs.androidx.core.ktx) // Kotlin extensions for core Android libraries

    // Testing libraries
    testImplementation(libs.junit) // JUnit testing framework
    androidTestImplementation(libs.androidx.junit) // AndroidX extension for JUnit
    androidTestImplementation(libs.androidx.espresso.core) // AndroidX Espresso for UI tests
    androidTestImplementation(libs.androidx.ui.test.junit4) // Testing library for Compose

    // Tooling for debugging and testing
    debugImplementation(libs.androidx.ui.tooling) // Tooling for debugging Compose UIs
    debugImplementation(libs.androidx.ui.test.manifest) // Tooling support for test manifests in Compose
    androidTestImplementation(platform(libs.androidx.compose.bom)) // Compose Bill of Materials for testing
}
