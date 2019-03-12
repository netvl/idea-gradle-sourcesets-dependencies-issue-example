// existing configuration

//val testRuntimeJar by tasks.creating(Jar::class) {
//    from(sourceSets.test.map { it.output })
//    archiveClassifier.set("test")
//}
//
//artifacts {
//    add("testRuntime", testRuntimeJar)
//}

// new configuration

val testOutput by configurations.creating {
    extendsFrom(configurations.testRuntime.get())
}

val testOutputJar by tasks.creating(Jar::class) {
    from(sourceSets.test.map { it.output })
    archiveClassifier.set("test")
}

artifacts {
    add(testOutput.name, testOutputJar)
}
