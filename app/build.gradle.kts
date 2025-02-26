plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.jetbrains.kotlin.android)
    id("com.google.devtools.ksp") version "2.0.0-1.0.23"
    id("com.google.dagger.hilt.android")
    id("org.jetbrains.kotlin.plugin.compose")
    alias(libs.plugins.kotlinx.serialization)
}

android {
    namespace = "ucne.edu.nathalygoris_p2_ap2"
    compileSdk = 35

    defaultConfig {
        applicationId = "ucne.edu.nathalygoris_p2_ap2"
        minSdk = 24
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
    buildFeatures {
        compose = true
    }
}

dependencies {

    implementation(libs.androidx.mediarouter)
    dependencies {

        implementation(libs.androidx.core.ktx)
        implementation(libs.androidx.lifecycle.runtime.ktx)
        implementation(libs.androidx.activity.compose)
        implementation(platform(libs.androidx.compose.bom))
        implementation(libs.androidx.ui)
        implementation(libs.androidx.ui.graphics)
        implementation(libs.androidx.ui.tooling.preview)
        implementation(libs.androidx.material3)

        implementation("com.google.dagger:hilt-android:2.51")
        implementation(libs.androidx.lifecycle.runtime.compose.android)
        ksp("com.google.dagger:hilt-android-compiler:2.51")
        implementation("androidx.hilt:hilt-navigation-compose:1.2.0")
        implementation(libs.kotlinx.serialization.json)

        //Retrofit
        implementation(libs.retrofit)
        implementation(libs.moshi.kotlin)
        implementation("com.squareup.retrofit2:converter-moshi:2.9.0")
        implementation("com.squareup.okhttp3:logging-interceptor:4.12.0")
        implementation("com.squareup.retrofit2:converter-gson:2.9.0")
        implementation(libs.androidx.espresso.core)
        implementation(libs.androidx.navigation.compose)
        testImplementation(libs.junit)
        androidTestImplementation(libs.androidx.junit)
        androidTestImplementation(libs.androidx.espresso.core)
        androidTestImplementation(platform(libs.androidx.compose.bom))
        androidTestImplementation(libs.androidx.ui.test.junit4)
        debugImplementation(libs.androidx.ui.tooling)
        debugImplementation(libs.androidx.ui.test.manifest)
    }
}