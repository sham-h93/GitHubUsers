plugins {
    `android-library`
    `kotlin-android`
}

apply<MainGradle>()

android {
    namespace = "ir.hoseinsa.domain"

    compileSdk = libs.versions.compileSdk.get().toInt()

    defaultConfig {
        minSdk = libs.versions.minSdk.get().toInt()
        targetSdk = libs.versions.targetSdk.get().toInt()
    }

}
dependencies {
    implementation(libs.koin.core)
    implementation(libs.paging.runtime)
}