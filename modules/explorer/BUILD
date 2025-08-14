load("@rules_scala//scala:scala.bzl", "scala_library")

scala_library(
    name = "explorer",
    srcs = [
        "src/main/Env.scala",
        "src/main/ExplorerImporter.scala",
        "src/main/package.scala",
    ],
    visibility = ["//:__subpackages__"],
    deps = [
        "//modules/common",
        "//modules/core",
        "//modules/game",
        "@maven//:com_github_lichess_org_scalachess_scalachess_3",
        "@maven//:com_softwaremill_macwire_macros_3",
        "@maven//:com_softwaremill_macwire_util_3",
        "@maven//:com_typesafe_play_play_3",
        "@maven//:com_typesafe_play_play_ws_standalone_json_3",
    ],
)
