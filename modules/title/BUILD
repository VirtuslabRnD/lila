load("@rules_scala//scala:scala.bzl", "scala_library")

scala_library(
    name = "title",
    srcs = [
        "src/main/Env.scala",
        "src/main/TitleApi.scala",
        "src/main/TitleForm.scala",
        "src/main/TitleRequest.scala",
        "src/main/package.scala",
        "src/main/ui/TitleModUi.scala",
        "src/main/ui/TitleUi.scala",
    ],
    visibility = ["//:__subpackages__"],
    deps = [
        "//modules/common",
        "//modules/core",
        "//modules/db",
        "//modules/memo",
        "//modules/ui",
        "@maven//:com_github_lichess_org_scalachess_scalachess_test_kit_3",
        "@maven//:com_github_lichess_org_scalalib_scalalib_lila_3",
        "@maven//:com_softwaremill_macwire_macros_3",
        "@maven//:com_softwaremill_macwire_util_3",
        "@maven//:com_typesafe_play_play_3",
        "@maven//:dev_optics_monocle_core_3",
        "@maven//:io_mola_galimatias_galimatias",
        "@maven//:org_reactivemongo_reactivemongo_bson_api_3",
    ],
)
