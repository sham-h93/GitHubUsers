plugins {
    id("githubusers.android.library")
}


android {
    namespace = "ir.hoseinsa.data"
}

dependencies {
    implementation(libs.koin.core)
    implementation(libs.koin.android)
    implementation(libs.bundles.ktor)
    implementation(libs.kotlinx.serialization.json)
    implementation(libs.paging.runtime)
    testImplementation(libs.junit)
    testImplementation(libs.truth)
    testImplementation(libs.coroutines.test)
    implementation(project(":domain"))
}