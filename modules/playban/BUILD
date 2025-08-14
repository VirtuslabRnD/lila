load("@rules_scala//scala:scala.bzl", "scala_library", "scala_test")

scala_library(
    name = "playban",
    srcs = [
        "src/main/Env.scala",
        "src/main/PlaybanApi.scala",
        "src/main/PlaybanFeedback.scala",
        "src/main/RageSit.scala",
        "src/main/model.scala",
        "src/main/package.scala",
    ],
    visibility = ["//:__subpackages__"],
    deps = [
        "//modules/common",
        "//modules/core",
        "//modules/db",
        "//modules/memo",
        "@maven//:com_github_lichess_org_scalachess_scalachess_test_kit_3",
        "@maven//:com_github_lichess_org_scalalib_scalalib_lila_3",
        "@maven//:com_github_lichess_org_scalalib_scalalib_model_3",
        "@maven//:com_softwaremill_macwire_macros_3",
        "@maven//:com_softwaremill_macwire_util_3",
        "@maven//:org_playframework_play_json_3",
        "@maven//:org_reactivemongo_reactivemongo_bson_api_3",
        "@maven//:org_typelevel_alleycats_core_3",
    ],
)

scala_test(
    name = "playban-tests",
    srcs = ["src/test/PlaybanTest.scala"],
    visibility = ["//:__subpackages__"],
    deps = [
        "//modules/core",
        "//modules/playban",
        "@maven//:com_github_lichess_org_scalalib_scalalib_model_3",
        "@maven//:org_scalameta_munit_scalacheck_3",
    ],
)
