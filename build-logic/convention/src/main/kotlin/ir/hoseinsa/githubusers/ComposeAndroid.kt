package ir.hoseinsa.githubusers

import com.android.build.api.dsl.CommonExtension
import org.gradle.api.Project
import org.gradle.kotlin.dsl.dependencies

fun Project.configureComposeAndroid(
    ext: CommonExtension<*, *, *, *, *, *>
) {
    ext.apply {
        buildFeatures {
            compose = true
        }
        composeOptions {
            kotlinCompilerExtensionVersion = libs.findVersion("compilerExtensionVersion").get().toString()
        }
//        dependencies {
//            implementation(libs.findLibrary("bundles-androidx").get().toString())
//            implementation(libs.findLibrary("bundles-compose").get().toString())
//            implementation(libs.findLibrary("navigation-compose").get().toString())
//            implementation(libs.findLibrary("lifecycle-runtime-ktx").get().toString())
//            implementation(libs.findLibrary("koin-core").get().toString())
//            implementation(libs.findLibrary("koin-android").get().toString())
//            implementation(libs.findLibrary("koin-compose").get().toString())
//        }
    }
}