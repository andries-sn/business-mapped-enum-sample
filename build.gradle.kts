
plugins {
    kotlin("jvm") version "1.5.0"
}

repositories {
    mavenCentral()
}


val junitVersion = "5.6.2"

dependencies {
    implementation(platform("org.jetbrains.kotlin:kotlin-bom"))
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
    testImplementation("org.jetbrains.kotlin:kotlin-test")
    testImplementation("org.junit.jupiter:junit-jupiter-api:$junitVersion")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:$junitVersion")
}

tasks.withType<Test> {
    useJUnitPlatform()
    testLogging { events("FAILED", "SKIPPED") }
    systemProperty("junit.jupiter.extensions.autodetection.enabled", "true")
    systemProperty("junit.jupiter.extensions.autodetection.enabled", "per_class")
}
