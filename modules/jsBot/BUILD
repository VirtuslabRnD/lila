load("@rules_scala//scala:scala.bzl", "scala_library")

scala_library(
    name = "jsBot",
    srcs = [
        "src/main/Env.scala",
        "src/main/JsBotApi.scala",
        "src/main/JsBotRepo.scala",
        "src/main/JsBotUi.scala",
        "src/main/model.scala",
        "src/main/package.scala",
    ],
    visibility = ["//:__subpackages__"],
    deps = [
        "//modules/common",
        "//modules/core",
        "//modules/db",
        "//modules/ui",
        "@maven//:com_softwaremill_macwire_macros_3",
        "@maven//:com_softwaremill_macwire_util_3",
        "@maven//:com_typesafe_akka_akka_stream_3",
        "@maven//:com_typesafe_play_play_3",
        "@maven//:org_playframework_play_json_3",
        "@maven//:org_reactivemongo_reactivemongo_bson_api_3",
    ],
)
