load("@rules_scala//scala:scala.bzl", "scala_library", "scala_test")

scala_library(
    name = "evaluation",
    srcs = [
        "src/main/AccountAction.scala",
        "src/main/Display.scala",
        "src/main/EvaluationBsonHandlers.scala",
        "src/main/GameAssessments.scala",
        "src/main/PlayerAggregateAssessment.scala",
        "src/main/PlayerAssessment.scala",
        "src/main/PlayerFlags.scala",
        "src/main/Statistics.scala",
        "src/main/package.scala",
    ],
    visibility = ["//:__subpackages__"],
    deps = [
        "//modules/analyse",
        "//modules/core",
        "//modules/db",
        "//modules/game",
        "//modules/rating",
        "@maven//:com_github_lichess_org_scalachess_scalachess_3",
        "@maven//:com_github_lichess_org_scalachess_scalachess_test_kit_3",
        "@maven//:com_github_lichess_org_scalalib_scalalib_lila_3",
        "@maven//:org_reactivemongo_reactivemongo_bson_api_3",
    ],
)

scala_test(
    name = "evaluation-tests",
    srcs = ["src/test/StatisticsTest.scala"],
    visibility = ["//:__subpackages__"],
    deps = [
        "//modules/evaluation",
        "@maven//:com_github_lichess_org_scalachess_scalachess_test_kit_3",
        "@maven//:org_scalameta_munit_scalacheck_3",
    ],
)
