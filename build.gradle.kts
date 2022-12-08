import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    idea
    jacoco

    kotlin("jvm") version "1.7.21"
    kotlin("plugin.spring") version "1.7.21"
    kotlin("plugin.jpa") version "1.7.21"

    id("org.springframework.boot") version "3.0.0"
    id("io.spring.dependency-management") version "1.1.0"

    id("org.jlleitschuh.gradle.ktlint") version "10.2.0"

    // Open Api
    id("org.springdoc.openapi-gradle-plugin") version "1.3.3"
    id("com.github.johnrengelman.processes") version "0.5.0" // for openapi-gradle-plugin
}

group = "ru.isin-smart-soft"
version = "1.0.0"
java.sourceCompatibility = JavaVersion.VERSION_17

repositories {
    mavenCentral()
}

dependencies {
    // Spring
    implementation("org.springframework.boot:spring-boot-starter-web")

    // Others
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin")

    // Kotlin
    implementation("org.jetbrains.kotlin:kotlin-reflect")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")

    // Testing
    testImplementation("org.springframework.boot:spring-boot-starter-test")
}

allOpen {
    annotation("javax.persistence.Entity")
    annotation("javax.persistence.MappedSuperclass")
    annotation("javax.persistence.Embeddable")
}
subprojects {
    apply {
        plugin("org.springframework.boot")
        plugin("kotlin")
        plugin("org.jetbrains.kotlin.plugin.allopen")
        plugin("org.jetbrains.kotlin.plugin.spring")
        plugin("org.jetbrains.kotlin.plugin.jpa")
        plugin("org.gradle.jacoco")
        plugin("org.jlleitschuh.gradle.ktlint")
        plugin("io.spring.dependency-management")
    }

    dependencyManagement {
        imports {
            mavenBom("org.springframework.cloud:spring-cloud-dependencies:2021.0.1")
            mavenBom("org.testcontainers:testcontainers-bom:1.16.3")
        }
    }

    tasks.withType<KotlinCompile> {
        kotlinOptions {
            freeCompilerArgs = listOf("-Xjsr305=strict")
            jvmTarget = "17"
        }
    }

    tasks.withType<Test> {
        useJUnitPlatform()
        minHeapSize = "128m"
        maxHeapSize = "1024m"
    }

    tasks.compileKotlin {
        dependsOn("ktlintCheck")
    }
}

allprojects {
    defaultTasks("clean", "build")
    tasks.getByName<org.springframework.boot.gradle.tasks.bundling.BootJar>("bootJar") { enabled = false }
    tasks.getByName<Jar>("jar") { enabled = false }
}

allprojects {
    repositories {
        mavenCentral()
    }
}
