import me.champeau.gradle.igp.gitRepositories

plugins {
    id("me.champeau.includegit") version "0.1.5"
}

rootProject.name = "config-repo-integration"
include("app")

gitRepositories {
    include("native-build-tools") {
        uri.set("git@github.com:graalvm/native-build-tools.git")
        branch.set("cc/config-repository-gradle")
    }
    include("config-repo") {
        uri.set("git@github.com:graalvm/native-configuration.git")
        branch.set("lm/jline-tests")
        autoInclude.set(false)
    }
}
