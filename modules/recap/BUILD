load("@rules_scala//scala:scala.bzl", "scala_library")

scala_library(
    name = "recap",
    srcs = [
        "src/main/Env.scala",
        "src/main/Recap.scala",
        "src/main/RecapApi.scala",
        "src/main/RecapBuilder.scala",
        "src/main/RecapJson.scala",
        "src/main/RecapRepo.scala",
        "src/main/package.scala",
        "src/main/ui/RecapUi.scala",
    ],
    visibility = ["//:__subpackages__"],
    deps = [
        "//modules/common",
        "//modules/core",
        "//modules/db",
        "//modules/game",
        "//modules/memo",
        "//modules/puzzle",
        "//modules/ui",
        "@maven//:com_github_lichess_org_scalachess_scalachess_3",
        "@maven//:com_github_lichess_org_scalachess_scalachess_test_kit_3",
        "@maven//:com_github_lichess_org_scalalib_scalalib_lila_3",
        "@maven//:com_softwaremill_macwire_macros_3",
        "@maven//:com_softwaremill_macwire_util_3",
        "@maven//:org_playframework_play_json_3",
        "@maven//:org_reactivemongo_reactivemongo_akkastream_3",
        "@maven//:org_reactivemongo_reactivemongo_bson_api_3",
    ],
)
