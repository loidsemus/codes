import kr.entree.spigradle.kotlin.spigot

plugins {
    kotlin("jvm") version "1.3.72"
    id("kr.entree.spigradle") version "1.2.4"
}

group = "me.loidsemus"
version = "1.0.0"

repositories {
    mavenCentral()
    spigot()
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))
    compileOnly(spigot("1.15.2"))
}

spigot {
    name = "Codes"
    authors = listOf("loidsemus")
    apiVersion = "1.13"
}

tasks {
    compileKotlin {
        kotlinOptions.jvmTarget = "1.8"
    }
    compileTestKotlin {
        kotlinOptions.jvmTarget = "1.8"
    }
}