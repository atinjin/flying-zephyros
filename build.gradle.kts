plugins {
    application
    kotlin("jvm") version "1.3.21"
}

application {
    mainClassName = "com.atinjin.lib.SimplePost"
}

dependencies {
    compile(kotlin("stdlib"))
    implementation(kotlin("reflect"))
    compile(group = "io.github.microutils", name = "kotlin-logging", version = "1.6.20")
    testImplementation(kotlin("test"))
    testImplementation(kotlin("test-junit"))
}

repositories {
    jcenter()
}