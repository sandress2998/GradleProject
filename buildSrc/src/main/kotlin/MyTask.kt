package my.plugin

import org.gradle.api.DefaultTask
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.tasks.TaskAction


abstract class MyTask : DefaultTask() {
    @TaskAction
    fun myTask() {
        println("Hello from the Custom Task!")
    }
}
