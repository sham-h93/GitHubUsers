plugins {
    `android-library`
    `kotlin-android`
    id("kotlinx-serialization")
}

apply<MainGradle>()

android {
    namespace = "ir.hoseinsa.data"

    compileSdk = libs.versions.compileSdk.get().toInt()

    defaultConfig {
        minSdk = libs.versions.minSdk.get().toInt()
        targetSdk = libs.versions.targetSdk.get().toInt()
    }

}

dependencies {
    implementation(libs.koin.core)
    implementation(libs.koin.android)
    implementation(libs.bundles.ktor)
    implementation(libs.kotlinx.serialization.json)
    implementation(libs.paging.runtime)

    domainModule()
}