## Native configuration integration demo

This project demonstrates integration between Gradle and the native configuration repository.

Running `./gradlew nativeTest` will execute tests in native mode.

The project will automatically:

- checkout the native-build-tools development branch which integrates with the configuration repository
- checkout the native configuration repository

It makes use of a JLine dependency to show that the configuration is actually fetched: you can run `./gradlew nativeCompile -Dorg.graalvm.internal.gradle.configrepo.logging=lifecycle` to actually see what configuration directories are used for which dependency.

See https://scans.gradle.com/s/nwy45hmibcrva/console-log#L104-L105 for example.


