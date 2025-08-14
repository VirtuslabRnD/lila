load("@rules_scala//scala:scala.bzl", "scala_library")

scala_library(
    name = "pool",
    srcs = [
        "src/main/Env.scala",
        "src/main/GameStarter.scala",
        "src/main/HookThieve.scala",
        "src/main/MatchMaking.scala",
        "src/main/PoolActor.scala",
        "src/main/PoolApi.scala",
        "src/main/PoolConfig.scala",
        "src/main/PoolList.scala",
        "src/main/PoolMember.scala",
        "src/main/package.scala",
    ],
    visibility = ["//:__subpackages__"],
    deps = [
        "//modules/common",
        "//modules/core",
        "//modules/coreI18n",
        "//modules/rating",
        "@maven//:com_github_lichess_org_scalachess_scalachess_3",
        "@maven//:com_github_lichess_org_scalachess_scalachess_rating_3",
        "@maven//:com_github_lichess_org_scalachess_scalachess_test_kit_3",
        "@maven//:com_github_lichess_org_scalalib_scalalib_lila_3",
        "@maven//:com_softwaremill_macwire_macros_3",
        "@maven//:com_softwaremill_macwire_util_3",
        "@maven//:com_typesafe_akka_akka_actor_3",
        "@maven//:com_typesafe_play_play_3",
        "@maven//:org_playframework_play_json_3",
        "@maven//:org_scala_lang_scala3_library_3",
    ],
)
