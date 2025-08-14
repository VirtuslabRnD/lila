load("@rules_scala//scala:scala.bzl", "scala_library", "scala_test")

scala_library(
    name = "coreI18n",
    srcs = [
        "src/main/i18n.scala",
        "src/main/key.scala",
        "src/main/modules.scala",
    ],
    visibility = ["//:__subpackages__"],
    deps = [
        "@maven//:com_github_lichess_org_scalalib_scalalib_model_3",
        "@maven//:com_lihaoyi_scalatags_3",
        "@maven//:com_typesafe_play_play_3",
        "@maven//:org_typelevel_cats_core_3",
    ],
)

scala_test(
    name = "coreI18n-tests",
    srcs = ["src/test/TranslatorStub.scala"],
    visibility = ["//:__subpackages__"],
    deps = [
        "//modules/coreI18n",
        "@maven//:com_typesafe_play_play_3",
    ],
)
