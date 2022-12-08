plugins {
    java
}

dependencies {
    // Log
    implementation("io.github.microutils:kotlin-logging-jvm:2.1.21")
    implementation("net.logstash.logback:logstash-logback-encoder:7.0.1")

    // Others
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
    implementation("javax.validation:validation-api:2.0.1.Final")


    // Kotlin
    implementation("org.jetbrains.kotlin:kotlin-reflect")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-reactor")

//    // TestContainers
//    testImplementation("org.testcontainers:junit-jupiter")
//    testImplementation("org.testcontainers:testcontainers")
//    testImplementation("org.testcontainers:postgresql")
//    // test
//    testImplementation("org.junit.jupiter:junit-jupiter-engine:5.8.2")
//    testImplementation("org.junit.jupiter:junit-jupiter-params:5.8.2")
//    testImplementation("org.jetbrains.kotlin:kotlin-test:1.6.10")
//    testImplementation("org.jetbrains.kotlin:kotlin-test-junit5:1.6.10")
//    testImplementation("io.mockk:mockk:1.12.3")
//    testImplementation("com.ninja-squad:springmockk:3.0.1")
//    testImplementation("com.nhaarman.mockitokotlin2:mockito-kotlin:2.2.0")
//
//    // db
//    runtimeOnly("org.postgresql:postgresql")

    // Kotlin + Testing
    testImplementation("io.projectreactor:reactor-test")
}