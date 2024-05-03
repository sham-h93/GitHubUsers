import com.android.build.api.dsl.ApplicationExtension
import ir.hoseinsa.githubusers.configureKotlinAndroid
import ir.hoseinsa.githubusers.libs
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.configure

class AndroidApplicationConventionPlugin: Plugin<Project> {

    override fun apply(target: Project) {
        with(target) {
            pluginManager.apply {
                apply("com.android.application")
                apply("org.jetbrains.kotlin.android")
            }
            extensions.configure<ApplicationExtension> {
                configureKotlinAndroid(this)
                defaultConfig {
                    targetSdk = Integer.parseInt(libs.findVersion("targetSdk").get().toString())
                }
            }
        }
    }

}