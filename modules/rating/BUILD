load("@rules_scala//scala:scala.bzl", "scala_library")

scala_library(
    name = "rating",
    srcs = [
        "src/main/BSONHandlers.scala",
        "src/main/Gaussian.scala",
        "src/main/Glicko.scala",
        "src/main/Perf.scala",
        "src/main/PerfType.scala",
        "src/main/RatingRange.scala",
        "src/main/RatingRegulator.scala",
        "src/main/UserPerfs.scala",
        "src/main/UserWithPerfs.scala",
        "src/main/package.scala",
    ],
    visibility = ["//:__subpackages__"],
    deps = [
        "//modules/common",
        "//modules/core",
        "//modules/coreI18n",
        "//modules/db",
        "//modules/ui",
        "@maven//:com_github_lichess_org_scalachess_scalachess_3",
        "@maven//:com_github_lichess_org_scalachess_scalachess_rating_3",
        "@maven//:com_github_lichess_org_scalachess_scalachess_test_kit_3",
        "@maven//:com_github_lichess_org_scalalib_scalalib_lila_3",
        "@maven//:org_apache_commons_commons_math3",
        "@maven//:org_reactivemongo_reactivemongo_bson_api_3",
        "@maven//:org_typelevel_alleycats_core_3",
        "@maven//:org_typelevel_kittens_3",
    ],
)
