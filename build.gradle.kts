plugins {
    val springBootVersion = "2.2.6.RELEASE"
    java
    id("org.springframework.boot") version springBootVersion apply false
    id("io.spring.dependency-management") version "1.0.9.RELEASE" apply false
}

allprojects {
    group = "com.skryvets"
    version = "0.0.1"

    repositories {
        mavenCentral()
    }
}

subprojects {
    apply(plugin = "java")
    apply(plugin = "org.springframework.boot")
    apply(plugin = "io.spring.dependency-management")

    configure<JavaPluginConvention> {
        sourceCompatibility = JavaVersion.VERSION_1_8
    }
}

configure<JavaPluginConvention> {
    sourceCompatibility = JavaVersion.VERSION_1_8
}