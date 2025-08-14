load("@rules_scala//scala:scala.bzl", "scala_library", "scala_test")

scala_library(
    name = "opening",
    srcs = [
        "src/main/Env.scala",
        "src/main/NameSection.scala",
        "src/main/OpeningAccessControl.scala",
        "src/main/OpeningApi.scala",
        "src/main/OpeningConfig.scala",
        "src/main/OpeningExplorer.scala",
        "src/main/OpeningPage.scala",
        "src/main/OpeningQuery.scala",
        "src/main/OpeningSearch.scala",
        "src/main/OpeningTree.scala",
        "src/main/OpeningWiki.scala",
        "src/main/package.scala",
        "src/main/ui/OpeningBits.scala",
        "src/main/ui/OpeningUi.scala",
        "src/main/ui/WikiUi.scala",
    ],
    visibility = ["//:__subpackages__"],
    deps = [
        "//modules/common",
        "//modules/core",
        "//modules/db",
        "//modules/memo",
        "//modules/ui",
        "@maven//:com_github_lichess_org_scalachess_scalachess_3",
        "@maven//:com_github_lichess_org_scalachess_scalachess_test_kit_3",
        "@maven//:com_github_lichess_org_scalalib_scalalib_lila_3",
        "@maven//:com_softwaremill_common_tagging_3",
        "@maven//:com_softwaremill_macwire_macros_3",
        "@maven//:com_softwaremill_macwire_util_3",
        "@maven//:com_typesafe_play_play_3",
        "@maven//:com_typesafe_play_play_ws_standalone_json_3",
        "@maven//:org_playframework_play_json_3",
        "@maven//:org_reactivemongo_reactivemongo_bson_api_3",
        "@maven//:org_scala_lang_scala3_library_3",
    ],
)

scala_test(
    name = "opening-tests",
    srcs = [
        "src/test/OpeningSearchTest.scala",
        "src/test/OpeningTest.scala",
    ],
    visibility = ["//:__subpackages__"],
    deps = [
        "//modules/opening",
        "@maven//:com_github_lichess_org_scalachess_scalachess_3",
        "@maven//:org_scalameta_munit_scalacheck_3",
    ],
)
