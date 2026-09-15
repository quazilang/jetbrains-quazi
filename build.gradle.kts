plugins {
    kotlin("jvm") version "2.0.21"
    id("org.jetbrains.intellij.platform") version "2.2.1"
}

group = "org.quazilang"
version = "0.1.0"

repositories { mavenCentral(); intellijPlatform { defaultRepositories() } }

dependencies {
    intellijPlatform { intellijIdea("2024.3") }
}

kotlin { jvmToolchain(21) }

intellijPlatform { pluginConfiguration { ideaVersion { sinceBuild = "243" } } }
