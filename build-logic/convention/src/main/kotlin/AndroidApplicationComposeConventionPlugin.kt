import com.android.build.api.dsl.ApplicationExtension
import ir.hoseinsa.githubusers.configureComposeAndroid
import ir.hoseinsa.githubusers.libs
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.configure

class AndroidApplicationComposeConventionPlugin: Plugin<Project> {

    override fun apply(target: Project) {
        with(target) {
            pluginManager.apply {
                apply("com.android.application")
            }
            extensions.configure<ApplicationExtension> {
                configureComposeAndroid(this)
                defaultConfig.targetSdk = Integer.parseInt(libs.findVersion("targetSdk").get().toString())
            }
        }
    }

}