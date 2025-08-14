load("@rules_scala//scala:scala.bzl", "scala_library")

scala_library(
    name = "bookmark",
    srcs = [
        "src/main/BookmarkApi.scala",
        "src/main/Env.scala",
        "src/main/PaginatorBuilder.scala",
        "src/main/package.scala",
    ],
    visibility = ["//:__subpackages__"],
    deps = [
        "//modules/common",
        "//modules/core",
        "//modules/db",
        "@maven//:com_github_lichess_org_scalalib_scalalib_lila_3",
        "@maven//:com_softwaremill_macwire_macros_3",
        "@maven//:com_softwaremill_macwire_util_3",
        "@maven//:org_reactivemongo_reactivemongo_bson_api_3",
    ],
)
