load("@rules_scala//scala:scala.bzl", "scala_library")

scala_library(
    name = "video",
    srcs = [
        "src/main/CsvParser.scala",
        "src/main/Env.scala",
        "src/main/Video.scala",
        "src/main/VideoApi.scala",
        "src/main/VideoSheet.scala",
        "src/main/View.scala",
        "src/main/Youtube.scala",
        "src/main/control.scala",
        "src/main/package.scala",
        "src/main/ui/VideoUi.scala",
    ],
    visibility = ["//:__subpackages__"],
    deps = [
        "//modules/common",
        "//modules/core",
        "//modules/db",
        "//modules/memo",
        "//modules/ui",
        "@maven//:com_github_lichess_org_scalalib_scalalib_lila_3",
        "@maven//:com_softwaremill_macwire_macros_3",
        "@maven//:com_softwaremill_macwire_util_3",
        "@maven//:com_typesafe_play_play_3",
        "@maven//:com_typesafe_play_play_ws_standalone_json_3",
        "@maven//:org_playframework_play_json_3",
        "@maven//:org_reactivemongo_reactivemongo_bson_api_3",
        "@maven//:org_scala_lang_scala3_library_3",
    ],
)
