// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
    // TODO: cosolidate to buildSrc
    val kotlin_compiler_version = "1.5.21"
    val hilt_agp_version = "2.38.1"

    repositories {
        google()
        mavenCentral()
    }
    dependencies {
        classpath("com.android.tools.build:gradle:7.0.2")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlin_compiler_version")
        classpath("com.google.dagger:hilt-android-gradle-plugin:$hilt_agp_version")
    }
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}
