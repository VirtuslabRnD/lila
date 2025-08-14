load("@rules_scala//scala:scala.bzl", "scala_library")

scala_library(
    name = "mailer",
    srcs = [
        "src/main/AutomaticEmail.scala",
        "src/main/Env.scala",
        "src/main/Mailer.scala",
        "src/main/package.scala",
    ],
    visibility = ["//:__subpackages__"],
    deps = [
        "//modules/common",
        "//modules/core",
        "//modules/coreI18n",
        "//modules/memo",
        "@maven//:com_github_lichess_org_scalachess_scalachess_test_kit_3",
        "@maven//:com_lihaoyi_scalatags_3",
        "@maven//:com_softwaremill_common_tagging_3",
        "@maven//:com_softwaremill_macwire_macros_3",
        "@maven//:com_softwaremill_macwire_util_3",
        "@maven//:com_typesafe_akka_akka_actor_3",
        "@maven//:com_typesafe_play_play_3",
        "@maven//:org_apache_commons_commons_email",
        "@maven//:org_playframework_play_mailer_3",
    ],
)
