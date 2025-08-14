load("@rules_scala//scala:scala.bzl", "scala_library")

scala_library(
    name = "teamSearch",
    srcs = [
        "src/main/Env.scala",
        "src/main/TeamSearchApi.scala",
        "src/main/package.scala",
    ],
    visibility = ["//:__subpackages__"],
    deps = [
        "//modules/common",
        "//modules/core",
        "//modules/search",
        "@maven//:com_github_lichess_org_lila_search_api_3",
        "@maven//:com_github_lichess_org_lila_search_client_3",
        "@maven//:com_github_lichess_org_lila_search_core_3",
        "@maven//:com_github_lichess_org_scalalib_scalalib_lila_3",
        "@maven//:com_softwaremill_macwire_macros_3",
        "@maven//:com_softwaremill_macwire_util_3",
    ],
)
