load("@rules_scala//scala:scala.bzl", "scala_library")

scala_library(
    name = "irc",
    srcs = [
        "src/main/Env.scala",
        "src/main/IrcApi.scala",
        "src/main/ZulipClient.scala",
        "src/main/package.scala",
    ],
    visibility = ["//:__subpackages__"],
    deps = [
        "//modules/common",
        "//modules/core",
        "@maven//:com_github_lichess_org_scalalib_scalalib_lila_3",
        "@maven//:com_softwaremill_macwire_macros_3",
        "@maven//:com_softwaremill_macwire_util_3",
        "@maven//:com_typesafe_akka_akka_actor_3",
        "@maven//:com_typesafe_play_play_3",
        "@maven//:com_typesafe_play_play_ws_standalone_json_3",
        "@maven//:org_playframework_play_json_3",
    ],
)
