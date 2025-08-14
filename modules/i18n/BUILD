load("@rules_scala//scala:scala.bzl", "scala_library", "scala_test")

scala_library(
    name = "i18n",
    srcs = [
        "src/main/Env.scala",
        "src/main/I18nQuantity.scala",
        "src/main/LangForm.scala",
        "src/main/LangList.scala",
        "src/main/LangPicker.scala",
        "src/main/Registry.scala",
        "src/main/Translation.scala",
        "src/main/Translator.scala",
        "src/main/package.scala",
    ],
    visibility = ["//:__subpackages__"],
    deps = [
        "//modules/common",
        "//modules/core",
        "//modules/coreI18n",
        "@maven//:com_github_lichess_org_scalalib_scalalib_model_3",
        "@maven//:com_lihaoyi_scalatags_3",
        "@maven//:com_softwaremill_macwire_macros_3",
        "@maven//:com_softwaremill_macwire_util_3",
        "@maven//:com_typesafe_play_play_3",
        "@maven//:org_scala_lang_scala3_library_3",
    ],
)

scala_test(
    name = "i18n-tests",
    srcs = ["src/test/TranslationTest.scala"],
    visibility = ["//:__subpackages__"],
    deps = [
        "//modules/coreI18n",
        "//modules/i18n",
        "@maven//:com_typesafe_play_play_3",
        "@maven//:org_scalameta_munit_scalacheck_3",
    ],
)
