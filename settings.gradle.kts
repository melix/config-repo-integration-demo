import me.champeau.gradle.igp.gitRepositories

plugins {
    id("me.champeau.includegit") version "0.1.5"
}

rootProject.name = "config-repo-integration"
include("app")

gitRepositories {
    include("native-build-tools") {
        uri.set("git@github.com:graalvm/native-build-tools.git")
        branch.set("master")
    }
    include("jvm-metadata-repo") {
        uri.set("git@github.com:graalvm/graalvm-reachability-metadata.git")
        branch.set("master")
        autoInclude.set(false)
    }
}

