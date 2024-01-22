plugins {
    `kotlin-dsl`
}

repositories {
    gradlePluginPortal()
    mavenCentral()
}

val lombokPluginVersion: String = "8.4"
val spotlessVersion: String = "6.13.0"

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
    implementation("com.diffplug.spotless:spotless-plugin-gradle:${spotlessVersion}")
    implementation("io.freefair.gradle:lombok-plugin:${lombokPluginVersion}")
}

gradlePlugin {
    plugins {
        create("scala213Variant") {
            id = "io.openlineage.scala213-variant"
            implementationClass = "io.openlineage.gradle.plugin.Scala213VariantPlugin"
        }

        create("commonConfig") {
            id = "io.openlineage.common-config"
            implementationClass = "io.openlineage.gradle.plugin.CommonConfigPlugin"
        }
    }
}