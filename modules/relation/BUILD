load("@rules_scala//scala:scala.bzl", "scala_library")

scala_library(
    name = "relation",
    srcs = [
        "src/main/Env.scala",
        "src/main/JsonView.scala",
        "src/main/RelationApi.scala",
        "src/main/RelationRepo.scala",
        "src/main/RelationStream.scala",
        "src/main/SubscriptionRepo.scala",
        "src/main/model.scala",
        "src/main/package.scala",
        "src/main/ui/RelationUi.scala",
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
        "@maven//:com_typesafe_play_play_3",
        "@maven//:org_playframework_play_json_3",
        "@maven//:org_reactivemongo_reactivemongo_3",
        "@maven//:org_reactivemongo_reactivemongo_akkastream_3",
        "@maven//:org_reactivemongo_reactivemongo_bson_api_3",
    ],
)
