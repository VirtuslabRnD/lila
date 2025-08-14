load("@rules_scala//scala:scala.bzl", "scala_library")

scala_library(
    name = "room",
    srcs = [
        "src/main/RoomSocket.scala",
        "src/main/package.scala",
    ],
    visibility = ["//:__subpackages__"],
    deps = [
        "//modules/common",
        "//modules/core",
        "@maven//:com_github_lichess_org_scalalib_scalalib_lila_3",
        "@maven//:org_playframework_play_json_3",
    ],
)
