load("@rules_scala//scala:scala.bzl", "scala_library", "scala_test")

scala_library(
    name = "lobby",
    srcs = [
        "src/main/AbortListener.scala",
        "src/main/Biter.scala",
        "src/main/BoardApiHookStream.scala",
        "src/main/Env.scala",
        "src/main/Hook.scala",
        "src/main/HookRepo.scala",
        "src/main/LobbySocket.scala",
        "src/main/LobbySyncActor.scala",
        "src/main/LobbyUser.scala",
        "src/main/MultiKeyMap.scala",
        "src/main/Seek.scala",
        "src/main/SeekApi.scala",
        "src/main/TriColor.scala",
        "src/main/actorApi.scala",
        "src/main/package.scala",
    ],
    visibility = ["//:__subpackages__"],
    deps = [
        "//modules/common",
        "//modules/core",
        "//modules/db",
        "//modules/memo",
        "//modules/rating",
        "@maven//:com_github_lichess_org_scalachess_scalachess_3",
        "@maven//:com_github_lichess_org_scalachess_scalachess_rating_3",
        "@maven//:com_github_lichess_org_scalachess_scalachess_test_kit_3",
        "@maven//:com_github_lichess_org_scalalib_scalalib_lila_3",
        "@maven//:com_github_lichess_org_scalalib_scalalib_model_3",
        "@maven//:com_softwaremill_macwire_macros_3",
        "@maven//:com_softwaremill_macwire_util_3",
        "@maven//:com_typesafe_akka_akka_stream_3",
        "@maven//:org_playframework_play_json_3",
    ],
)

scala_test(
    name = "lobby-tests",
    srcs = ["src/test/MultiKeyMapTest.scala"],
    visibility = ["//:__subpackages__"],
    deps = [
        "//modules/lobby",
        "@maven//:org_scalameta_munit_scalacheck_3",
    ],
)
