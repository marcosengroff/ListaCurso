plugins {
    alias(libs.plugins.androidApplication)
}

android {
    namespace = "devandroid.marcos.applistacurso"
    compileSdk = 34

    defaultConfig {
        applicationId = "devandroid.marcos.applistacurso"
        minSdk = 26
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"


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

    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)

}