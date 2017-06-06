# java6test
Quick test for class loading rules when compiling for previous Java version.  In particular, it tests to see whether a fully qualified reference or import matters when trying to avoid link errors and shows that both work fine.

* Requires Docker (should honor Docker Machine environment variables, but I used Docker for Mac) for executing the tests.
* Build and execute with `./gradlew check` (invokes the wrapper script so no need to install Gradle); requires at least Java 7 to build, though Java 8 works fine.
* All it does is check for the Java specification version and determine what Deque implementation to use.  One class uses a fully qualified reference and the other uses an import.  Both work.
