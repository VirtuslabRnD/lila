load("@rules_scala//scala:scala.bzl", "scala_library")

scala_library(
    name = "socket",
    srcs = [
        "src/main/Env.scala",
        "src/main/RemoteSocket.scala",
        "src/main/SocketRequester.scala",
        "src/main/UserLagCache.scala",
        "src/main/package.scala",
    ],
    visibility = ["//:__subpackages__"],
    deps = [
        "//modules/common",
        "//modules/core",
        "//modules/memo",
        "@maven//:com_github_ben_manes_caffeine_caffeine",
        "@maven//:com_github_blemale_scaffeine_3",
        "@maven//:com_github_lichess_org_scalachess_scalachess_test_kit_3",
        "@maven//:com_softwaremill_macwire_macros_3",
        "@maven//:com_softwaremill_macwire_util_3",
        "@maven//:com_typesafe_akka_akka_actor_3",
        "@maven//:com_typesafe_play_play_3",
        "@maven//:io_lettuce_lettuce_core",
        "@maven//:org_playframework_play_json_3",
    ],
)
