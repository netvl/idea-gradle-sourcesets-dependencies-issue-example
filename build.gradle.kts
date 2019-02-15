plugins {
    id("com.github.maiflai.scalatest").version("0.23").apply(false)
}

subprojects {
    apply {
        plugin("java")
        plugin("scala")
        plugin("com.github.maiflai.scalatest")
    }

    dependencies {
        "compile"(group = "org.scala-lang", name = "scala-library", version = "2.11.12")

        "testCompile"(group = "org.scalatest", name = "scalatest_2.11", version = "3.0.5")
        "testRuntime"(group = "org.pegdown", name = "pegdown", version = "1.4.2")
    }
}
