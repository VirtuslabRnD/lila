load("@rules_scala//scala:scala.bzl", "scala_library")

scala_library(
    name = "history",
    srcs = [
        "src/main/Env.scala",
        "src/main/History.scala",
        "src/main/HistoryApi.scala",
        "src/main/RatingChartApi.scala",
        "src/main/package.scala",
    ],
    visibility = ["//:__subpackages__"],
    deps = [
        "//modules/common",
        "//modules/core",
        "//modules/coreI18n",
        "//modules/db",
        "//modules/memo",
        "//modules/rating",
        "@maven//:com_github_lichess_org_scalachess_scalachess_test_kit_3",
        "@maven//:com_github_lichess_org_scalalib_scalalib_model_3",
        "@maven//:com_softwaremill_common_tagging_3",
        "@maven//:com_softwaremill_macwire_macros_3",
        "@maven//:com_softwaremill_macwire_util_3",
        "@maven//:com_typesafe_play_play_3",
        "@maven//:org_playframework_play_json_3",
        "@maven//:org_reactivemongo_reactivemongo_bson_api_3",
        "@maven//:org_scala_lang_scala3_library_3",
    ],
)
