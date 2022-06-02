plugins {
    application
    id("org.graalvm.buildtools.native")
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.jline:jline:3.21.0")
    testImplementation("org.junit.jupiter:junit-jupiter:5.8.1")
}

application {
    mainClass.set("org.graalvm.demo.App")
}

tasks.withType<Test>().configureEach {
    useJUnitPlatform()
}

graalvmNative {
    metadataRepository {
        enabled.set(true)
        uri(file("../checkouts/jvm-metadata-repo/metadata"))
    }
    binaries.all {
        buildArgs.add("--allow-incomplete-classpath")
    }
}
