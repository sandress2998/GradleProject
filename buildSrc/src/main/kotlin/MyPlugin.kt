import org.gradle.api.Plugin
import org.gradle.api.Project

class MyPlugin : Plugin<Project> {
    override fun apply(project: Project) {
        project.task("greet") {
            doLast {
                println("Hello from MyGreetingPlugin!")
            }
        }
    }
}