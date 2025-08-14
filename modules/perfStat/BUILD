load("@rules_scala//scala:scala.bzl", "scala_library")

scala_library(
    name = "perfStat",
    srcs = [
        "src/main/Env.scala",
        "src/main/JsonView.scala",
        "src/main/PerfStat.scala",
        "src/main/PerfStatApi.scala",
        "src/main/PerfStatIndexer.scala",
        "src/main/PerfStatStorage.scala",
        "src/main/PerfStatUi.scala",
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
        "//modules/ui",
        "@maven//:com_github_lichess_org_scalachess_scalachess_rating_3",
        "@maven//:com_github_lichess_org_scalachess_scalachess_test_kit_3",
        "@maven//:com_github_lichess_org_scalalib_scalalib_lila_3",
        "@maven//:com_softwaremill_common_tagging_3",
        "@maven//:com_softwaremill_macwire_macros_3",
        "@maven//:com_softwaremill_macwire_util_3",
        "@maven//:org_playframework_play_json_3",
        "@maven//:org_reactivemongo_reactivemongo_bson_api_3",
    ],
)
