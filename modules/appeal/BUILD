load("@rules_scala//scala:scala.bzl", "scala_library")

scala_library(
    name = "appeal",
    srcs = [
        "src/main/Appeal.scala",
        "src/main/AppealApi.scala",
        "src/main/BsonHandlers.scala",
        "src/main/Env.scala",
        "src/main/package.scala",
        "src/main/ui/AppealTreeUi.scala",
        "src/main/ui/AppealUi.scala",
    ],
    visibility = ["//:__subpackages__"],
    deps = [
        "//modules/common",
        "//modules/core",
        "//modules/db",
        "//modules/memo",
        "//modules/ui",
        "@maven//:com_softwaremill_macwire_macros_3",
        "@maven//:com_softwaremill_macwire_util_3",
        "@maven//:org_reactivemongo_reactivemongo_bson_api_3",
    ],
)
