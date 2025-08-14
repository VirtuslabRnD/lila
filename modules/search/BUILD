load("@rules_scala//scala:scala.bzl", "scala_library")

scala_library(
    name = "search",
    srcs = [
        "src/main/Env.scala",
        "src/main/LilaSearchClient.scala",
        "src/main/PaginatorBuilder.scala",
        "src/main/SearchReadApi.scala",
        "src/main/package.scala",
    ],
    visibility = ["//:__subpackages__"],
    deps = [
        "//modules/common",
        "//modules/core",
        "@maven//:com_github_lichess_org_lila_search_api_3",
        "@maven//:com_github_lichess_org_lila_search_client_3",
        "@maven//:com_github_lichess_org_scalalib_scalalib_lila_3",
        "@maven//:com_softwaremill_macwire_macros_3",
        "@maven//:com_softwaremill_macwire_util_3",
        "@maven//:com_typesafe_play_play_3",
        "@maven//:com_typesafe_play_play_ws_standalone_json_3",
    ],
)
