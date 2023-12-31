plugins {
    id("com.android.application")
    id("com.google.gms.google-services")
}

android {
    namespace = "com.example.rescue"
    compileSdk = 34


    defaultConfig {
        applicationId = "com.example.rescue"
        minSdk = 28
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

dependencies {

//    // Other dependencies you might have, for example:
//    implementation ("androidx.appcompat:appcompat:1.4.1")
//
//    // Add the ViewPager2 dependency here:
//    implementation ("androidx.viewpager2:viewpager2:2.1.0")


    implementation ("androidx.camera:camera-camera2:1.2.3") // use the latest version
    implementation ("androidx.camera:camera-lifecycle:1.2.3") // use the latest version
    implementation ("androidx.camera:camera-view:1.2.3") // for the CameraView widget


    implementation ("androidx.appcompat:appcompat:1.6.1")
    implementation ("androidx.core:core:1.12.0")


    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.10.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    implementation("com.google.firebase:firebase-firestore:24.8.1")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
}