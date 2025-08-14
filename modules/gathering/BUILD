load("@rules_scala//scala:scala.bzl", "scala_library", "scala_test")

scala_library(
    name = "gathering",
    srcs = [
        "src/main/Condition.scala",
        "src/main/ConditionForm.scala",
        "src/main/ConditionHandlers.scala",
        "src/main/ConditionList.scala",
        "src/main/GatheringClock.scala",
        "src/main/GatheringJson.scala",
        "src/main/GreatPlayer.scala",
        "src/main/Quote.scala",
        "src/main/Thematic.scala",
        "src/main/package.scala",
        "src/main/ui/GatheringUi.scala",
    ],
    visibility = ["//:__subpackages__"],
    deps = [
        "//modules/common",
        "//modules/core",
        "//modules/coreI18n",
        "//modules/rating",
        "//modules/ui",
        "@maven//:com_github_lichess_org_scalachess_scalachess_3",
        "@maven//:com_github_lichess_org_scalachess_scalachess_test_kit_3",
        "@maven//:com_github_lichess_org_scalalib_scalalib_lila_3",
        "@maven//:com_github_lichess_org_scalalib_scalalib_model_3",
        "@maven//:com_typesafe_play_play_3",
        "@maven//:org_playframework_play_json_3",
        "@maven//:org_scala_lang_scala3_library_3",
    ],
)

scala_test(
    name = "gathering-tests",
    srcs = ["src/test/PrizeTest.scala"],
    visibility = ["//:__subpackages__"],
    deps = [
        "//modules/gathering",
        "@maven//:org_scalameta_munit_scalacheck_3",
    ],
)
