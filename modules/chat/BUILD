load("@rules_scala//scala:scala.bzl", "scala_library")

scala_library(
    name = "chat",
    srcs = [
        "src/main/Chat.scala",
        "src/main/ChatApi.scala",
        "src/main/ChatTimeout.scala",
        "src/main/ChatUi.scala",
        "src/main/Env.scala",
        "src/main/JsonView.scala",
        "src/main/Line.scala",
        "src/main/model.scala",
        "src/main/package.scala",
    ],
    visibility = ["//:__subpackages__"],
    deps = [
        "//modules/common",
        "//modules/core",
        "//modules/db",
        "//modules/memo",
        "//modules/ui",
        "@maven//:com_github_lichess_org_scalachess_scalachess_test_kit_3",
        "@maven//:com_github_lichess_org_scalalib_scalalib_lila_3",
        "@maven//:com_softwaremill_macwire_macros_3",
        "@maven//:com_softwaremill_macwire_util_3",
        "@maven//:com_typesafe_play_play_3",
        "@maven//:org_playframework_play_json_3",
        "@maven//:org_reactivemongo_reactivemongo_bson_api_3",
    ],
)
