plugins {
    id("githubusers.android.library")
    id("githubusers.android.library.compose")
}

android {
    namespace = "ir.hoseinsa.presenter"
}

dependencies {
    implementation(libs.androidx.ktx)
    implementation(libs.android.material)
    implementation(libs.app.compat)
    implementation(libs.activity.compose)
    implementation(libs.compose.runtime)
    implementation(libs.compose.ui)
    implementation(libs.compose.ui.graphics)
    debugImplementation(libs.compose.ui.tooling)
    debugImplementation(libs.compose.ui.tooling.preview)
    debugImplementation(libs.compose.ui.test.manifest)
    implementation(libs.compose.material3)
    implementation(libs.navigation.compose)
    implementation(libs.lifecycle.runtime.ktx)
    implementation(libs.koin.core)
    implementation(libs.koin.android)
    implementation(libs.koin.compose)
    implementation(libs.paging.compose)
    implementation(libs.coil.compose)
    implementation(project(":domain"))
}