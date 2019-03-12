rootProject.name = "example"

include("core", "contrib")

rootProject.children.forEach {
    it.projectDir = file("components/${it.name}")
}
