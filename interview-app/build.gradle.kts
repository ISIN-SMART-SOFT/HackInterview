plugins {
    `spring-boot`
}

springBoot {
    mainClass.set("ru.isinsmartsoft.hackinterview.app.Application")
}

dependencies {
    // Spring Boot
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("org.springframework.boot:spring-boot-starter-actuator")
    implementation("org.springframework.boot:spring-boot-starter-validation")

    implementation("org.springframework.boot:spring-boot-starter-data-jpa")

    // Swagger
    implementation("org.springdoc:springdoc-openapi-ui:$swaggerVersion")
    implementation("org.springdoc:springdoc-openapi-kotlin:$swaggerVersion")
    // implementation("org.springdoc:springdoc-openapi-security:1.6.6")
    // implementation("org.springdoc:springdoc-openapi-data-rest:1.6.6")

    // BD
    runtimeOnly("org.postgresql:postgresql")
    implementation("org.flywaydb:flyway-core")
}

tasks.getByName<org.springframework.boot.gradle.tasks.bundling.BootJar>("bootJar") {
    enabled = true
    archiveBaseName.set(rootProject.name)
}

tasks.withType<Test> {
    useJUnitPlatform()
}
