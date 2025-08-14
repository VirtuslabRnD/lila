load("@rules_scala//scala:scala.bzl", "scala_library")

scala_library(
    name = "bot",
    srcs = [
        "src/main/BoardReport.scala",
        "src/main/BotForm.scala",
        "src/main/BotJsonView.scala",
        "src/main/BotPlayer.scala",
        "src/main/Env.scala",
        "src/main/GameStateStream.scala",
        "src/main/OnlineApiUsers.scala",
        "src/main/package.scala",
    ],
    visibility = ["//:__subpackages__"],
    deps = [
        "//modules/chat",
        "//modules/common",
        "//modules/core",
        "//modules/coreI18n",
        "//modules/game",
        "//modules/memo",
        "//modules/ui",
        "@maven//:com_github_lichess_org_scalachess_scalachess_3",
        "@maven//:com_github_lichess_org_scalachess_scalachess_test_kit_3",
        "@maven//:com_github_lichess_org_scalalib_scalalib_lila_3",
        "@maven//:com_softwaremill_macwire_macros_3",
        "@maven//:com_softwaremill_macwire_util_3",
        "@maven//:com_typesafe_akka_akka_actor_3",
        "@maven//:com_typesafe_akka_akka_stream_3",
        "@maven//:com_typesafe_play_play_3",
        "@maven//:org_playframework_play_json_3",
    ],
)
