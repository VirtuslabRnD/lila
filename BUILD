# Gazelle moved to //gazelle (and that package is in .bazelignore) so the root
# package loads without pulling in rules_go (CcInfo breakage on newer Bazel).
# To run Gazelle: remove "gazelle" from .bazelignore, then bazel run //gazelle:gazelle
load("@rules_scala//scala:scala_toolchain.bzl", "scala_toolchain")

scala_toolchain(
    name = "default_scala_toolchain",
    dependency_mode = "transitive",
    dependency_tracking_method = "ast",
    scalacopts = [
        "-Xsource:3",
        "-language:postfixOps",
        "-release:21",
        "-Xlint:unused",
    ],
    strict_deps_mode = "off",
)

toolchain(
    name = "scala_toolchain",
    toolchain = ":default_scala_toolchain",
    toolchain_type = "@rules_scala//scala:toolchain_type",
)
