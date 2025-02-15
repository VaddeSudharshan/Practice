plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    //id ("kotlin-kapt")
    id ("kotlin-parcelize")
    id("com.google.devtools.ksp")
    id ("androidx.navigation.safeargs.kotlin")

//    id("com.google.gms.google-services")

}

android {
    namespace = "com.rishva.roomdatabase_practiceapp"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.rishva.roomdatabase_practiceapp"
        minSdk = 24
        targetSdk = 34
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
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures{
        dataBinding = true
    }
}

dependencies {

    implementation("androidx.core:core-ktx:1.13.1")
    implementation("androidx.appcompat:appcompat:1.7.0")
    implementation("com.google.android.material:material:1.12.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.2.1")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.6.1")



    implementation ("androidx.room:room-runtime:2.6.1")
    ksp("androidx.room:room-compiler:2.6.1")

    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.7.1")
    implementation ("androidx.room:room-ktx:2.6.1")

    implementation("androidx.navigation:navigation-fragment-ktx:2.7.5")
    implementation("androidx.navigation:navigation-ui-ktx:2.7.5")

    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.6.2")
    implementation("androidx.lifecycle:lifecycle-livedata-ktx:2.6.2")
    ksp("androidx.lifecycle:lifecycle-compiler:2.6.2")

//    implementation(platform("com.google.firebase:firebase-bom:33.1.2"))
//    implementation("com.google.firebase:firebase-analytics")
//    implementation("com.google.firebase:firebase-crashlytics")



}