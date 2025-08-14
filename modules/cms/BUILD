load("@rules_scala//scala:scala.bzl", "scala_library")

scala_library(
    name = "cms",
    srcs = [
        "src/main/CmsApi.scala",
        "src/main/CmsForm.scala",
        "src/main/CmsMarkup.scala",
        "src/main/CmsPage.scala",
        "src/main/CmsUi.scala",
        "src/main/Env.scala",
        "src/main/package.scala",
    ],
    visibility = ["//:__subpackages__"],
    deps = [
        "//modules/common",
        "//modules/core",
        "//modules/coreI18n",
        "//modules/db",
        "//modules/memo",
        "//modules/ui",
        "@maven//:com_github_lichess_org_scalalib_scalalib_lila_3",
        "@maven//:com_github_lichess_org_scalalib_scalalib_model_3",
        "@maven//:com_softwaremill_macwire_macros_3",
        "@maven//:com_softwaremill_macwire_util_3",
        "@maven//:com_typesafe_play_play_3",
        "@maven//:org_reactivemongo_reactivemongo_bson_api_3",
    ],
)
