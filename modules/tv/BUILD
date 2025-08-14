load("@rules_scala//scala:scala.bzl", "scala_library")

scala_library(
    name = "tv",
    srcs = [
        "src/main/ChannelSyncActor.scala",
        "src/main/Env.scala",
        "src/main/Tv.scala",
        "src/main/TvBroadcast.scala",
        "src/main/TvSyncActor.scala",
        "src/main/TvUi.scala",
        "src/main/package.scala",
    ],
    visibility = ["//:__subpackages__"],
    deps = [
        "//modules/common",
        "//modules/core",
        "//modules/coreI18n",
        "//modules/game",
        "//modules/ui",
        "@maven//:com_github_lichess_org_scalachess_scalachess_3",
        "@maven//:com_github_lichess_org_scalachess_scalachess_test_kit_3",
        "@maven//:com_github_lichess_org_scalalib_scalalib_lila_3",
        "@maven//:com_softwaremill_macwire_macros_3",
        "@maven//:com_softwaremill_macwire_util_3",
        "@maven//:com_typesafe_akka_akka_actor_3",
        "@maven//:com_typesafe_akka_akka_stream_3",
        "@maven//:dev_optics_monocle_core_3",
        "@maven//:org_playframework_play_json_3",
        "@maven//:org_scala_lang_scala3_library_3",
    ],
)
