load("@rules_scala//scala:scala.bzl", "scala_library")

scala_library(
    name = "notify",
    srcs = [
        "src/main/BSONHandlers.scala",
        "src/main/Env.scala",
        "src/main/JsonHandlers.scala",
        "src/main/Notification.scala",
        "src/main/NotificationPref.scala",
        "src/main/NotificationRepo.scala",
        "src/main/NotifyApi.scala",
        "src/main/NotifyCli.scala",
        "src/main/package.scala",
    ],
    visibility = ["//:__subpackages__"],
    deps = [
        "//modules/common",
        "//modules/core",
        "//modules/db",
        "//modules/memo",
        "//modules/ui",
        "@maven//:com_github_lichess_org_scalalib_scalalib_lila_3",
        "@maven//:com_softwaremill_macwire_macros_3",
        "@maven//:com_softwaremill_macwire_util_3",
        "@maven//:com_typesafe_akka_akka_stream_3",
        "@maven//:org_playframework_play_json_3",
        "@maven//:org_reactivemongo_reactivemongo_bson_api_3",
    ],
)
