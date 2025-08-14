load("@rules_scala//scala:scala.bzl", "scala_library", "scala_test")

scala_library(
    name = "shutup",
    srcs = [
        "src/main/Analyser.scala",
        "src/main/Dictionary.scala",
        "src/main/Env.scala",
        "src/main/PublicLine.scala",
        "src/main/PublicSource.scala",
        "src/main/ShutupApi.scala",
        "src/main/model.scala",
        "src/main/package.scala",
    ],
    visibility = ["//:__subpackages__"],
    deps = [
        "//modules/common",
        "//modules/core",
        "//modules/db",
        "@maven//:com_lihaoyi_scalatags_3",
        "@maven//:com_softwaremill_macwire_macros_3",
        "@maven//:com_softwaremill_macwire_util_3",
        "@maven//:org_reactivemongo_reactivemongo_bson_api_3",
        "@maven//:org_scala_lang_scala3_library_3",
    ],
)

scala_test(
    name = "shutup-tests",
    srcs = [
        "src/test/AnalyserTest.scala",
        "src/test/HighlightTest.scala",
    ],
    visibility = ["//:__subpackages__"],
    deps = [
        "//modules/shutup",
        "@maven//:com_lihaoyi_scalatags_3",
        "@maven//:org_scalameta_munit_scalacheck_3",
    ],
)
