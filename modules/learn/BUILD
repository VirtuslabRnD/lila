load("@rules_scala//scala:scala.bzl", "scala_library")

scala_library(
    name = "learn",
    srcs = [
        "src/main/Env.scala",
        "src/main/LearnApi.scala",
        "src/main/LearnHandlers.scala",
        "src/main/LearnProgress.scala",
        "src/main/StageProgress.scala",
        "src/main/package.scala",
    ],
    visibility = ["//:__subpackages__"],
    deps = [
        "//modules/common",
        "//modules/core",
        "//modules/db",
        "@maven//:com_typesafe_play_play_3",
        "@maven//:org_playframework_play_json_3",
        "@maven//:org_reactivemongo_reactivemongo_bson_api_3",
    ],
)
