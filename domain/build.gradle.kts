plugins {
    id("githubusers.android.library")
}


android {
    namespace = "ir.hoseinsa.domain"

}
dependencies {
    implementation(libs.koin.core)
    implementation(libs.paging.runtime)
}