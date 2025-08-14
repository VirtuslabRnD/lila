load("@rules_scala//scala:scala.bzl", "scala_library")

scala_library(
    name = "push",
    srcs = [
        "src/main/Device.scala",
        "src/main/DeviceApi.scala",
        "src/main/Env.scala",
        "src/main/FirebasePush.scala",
        "src/main/PushApi.scala",
        "src/main/Stacking.scala",
        "src/main/Urgency.scala",
        "src/main/WebPush.scala",
        "src/main/WebSubscription.scala",
        "src/main/WebSubscriptionApi.scala",
        "src/main/package.scala",
    ],
    visibility = ["//:__subpackages__"],
    deps = [
        "//modules/common",
        "//modules/core",
        "//modules/db",
        "@maven//:com_github_lichess_org_scalalib_scalalib_lila_3",
        "@maven//:com_google_auth_google_auth_library_oauth2_http",
        "@maven//:com_softwaremill_macwire_macros_3",
        "@maven//:com_softwaremill_macwire_util_3",
        "@maven//:com_typesafe_akka_akka_actor_3",
        "@maven//:com_typesafe_play_play_3",
        "@maven//:com_typesafe_play_play_ws_standalone_json_3",
        "@maven//:org_playframework_play_json_3",
        "@maven//:org_reactivemongo_reactivemongo_bson_api_3",
    ],
)
