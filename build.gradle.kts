import my.plugin.MyTask

plugins {
    kotlin("jvm") version "2.0.0"
}

group = "ru.mephi"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(17)
}

apply<MyPlugin>()

tasks {
    register<MyTask>("myTask")
}