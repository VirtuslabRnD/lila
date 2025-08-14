load("@rules_scala//scala:scala.bzl", "scala_library")

scala_library(
    name = "tree",
    srcs = [
        "src/main/Advice.scala",
        "src/main/Analysis.scala",
        "src/main/ExportOptions.scala",
        "src/main/Info.scala",
        "src/main/NewTreeBuilder.scala",
        "src/main/ParseImport.scala",
        "src/main/StatusText.scala",
        "src/main/TreeBuilder.scala",
        "src/main/eval.scala",
        "src/main/newTree.scala",
        "src/main/package.scala",
        "src/main/tree.scala",
    ],
    visibility = ["//:__subpackages__"],
    deps = [
        "//modules/core",
        "@maven//:com_github_lichess_org_scalachess_scalachess_3",
        "@maven//:com_github_lichess_org_scalachess_scalachess_play_json_3",
        "@maven//:com_github_lichess_org_scalachess_scalachess_test_kit_3",
        "@maven//:com_github_lichess_org_scalalib_scalalib_lila_3",
        "@maven//:com_github_lichess_org_scalalib_scalalib_play_json_3",
        "@maven//:dev_optics_monocle_core_3",
        "@maven//:org_playframework_play_json_3",
        "@maven//:org_typelevel_alleycats_core_3",
        "@maven//:org_typelevel_cats_core_3",
    ],
)
