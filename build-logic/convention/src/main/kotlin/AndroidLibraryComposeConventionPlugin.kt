import com.android.build.gradle.LibraryExtension
import ir.hoseinsa.githubusers.configureComposeAndroid
import ir.hoseinsa.githubusers.configureKotlinAndroid
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.configure

class AndroidLibraryComposeConventionPlugin: Plugin<Project> {

    override fun apply(target: Project) {
        with(target) {
            apply {
               plugin("com.android.library")
               plugin("org.jetbrains.kotlin.android")
            }
            extensions.configure<LibraryExtension> {
                configureKotlinAndroid(this)
                configureComposeAndroid(this)
            }
        }
    }
}