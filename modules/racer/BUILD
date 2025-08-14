load("@rules_scala//scala:scala.bzl", "scala_library")

scala_library(
    name = "racer",
    srcs = [
        "src/main/Env.scala",
        "src/main/RacerApi.scala",
        "src/main/RacerBsonHandlers.scala",
        "src/main/RacerJson.scala",
        "src/main/RacerLobby.scala",
        "src/main/RacerPlayer.scala",
        "src/main/RacerRace.scala",
        "src/main/RacerSocket.scala",
        "src/main/package.scala",
        "src/main/ui/RacerUi.scala",
    ],
    visibility = ["//:__subpackages__"],
    deps = [
        "//modules/common",
        "//modules/core",
        "//modules/db",
        "//modules/memo",
        "//modules/room",
        "//modules/storm",
        "//modules/ui",
        "@maven//:com_github_lichess_org_scalachess_scalachess_3",
        "@maven//:com_github_lichess_org_scalachess_scalachess_test_kit_3",
        "@maven//:com_github_lichess_org_scalalib_scalalib_lila_3",
        "@maven//:com_softwaremill_macwire_macros_3",
        "@maven//:com_softwaremill_macwire_util_3",
        "@maven//:org_playframework_play_json_3",
        "@maven//:org_reactivemongo_reactivemongo_bson_api_3",
    ],
)
