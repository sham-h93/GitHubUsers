plugins {
    id("githubusers.android.application")
    id("githubusers.android.application.compose")
}

android {
    namespace = "ir.hoseinsa.githubusers"

    defaultConfig {
        applicationId = "ir.hoseinsa.githubusers"
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
}

dependencies {
    implementation(libs.bundles.androidx)
    implementation(libs.bundles.compose)
    implementation(libs.navigation.compose)
    implementation(libs.lifecycle.runtime.ktx)
    implementation(libs.koin.core)
    implementation(libs.koin.android)
    implementation(libs.koin.compose)
    implementation(project(":data"))
    implementation(project(":domain"))
    implementation(project(":presenter"))

}