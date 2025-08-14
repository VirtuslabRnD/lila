load("@rules_scala//scala:scala.bzl", "scala_library")

scala_library(
    name = "gameSearch",
    srcs = [
        "src/main/Env.scala",
        "src/main/Fields.scala",
        "src/main/FormHelpers.scala",
        "src/main/GameSearchApi.scala",
        "src/main/GameSearchForm.scala",
        "src/main/GameSearchUi.scala",
        "src/main/Sorting.scala",
        "src/main/UserGameSearch.scala",
        "src/main/package.scala",
    ],
    visibility = ["//:__subpackages__"],
    deps = [
        "//modules/common",
        "//modules/core",
        "//modules/coreI18n",
        "//modules/search",
        "//modules/ui",
        "@maven//:com_disneystreaming_smithy4s_smithy4s_core_3",
        "@maven//:com_github_lichess_org_lila_search_api_3",
        "@maven//:com_github_lichess_org_lila_search_client_3",
        "@maven//:com_github_lichess_org_lila_search_core_3",
        "@maven//:com_github_lichess_org_scalachess_scalachess_test_kit_3",
        "@maven//:com_github_lichess_org_scalalib_scalalib_lila_3",
        "@maven//:com_softwaremill_macwire_macros_3",
        "@maven//:com_softwaremill_macwire_util_3",
        "@maven//:com_typesafe_akka_akka_stream_3",
        "@maven//:com_typesafe_play_play_3",
    ],
)
