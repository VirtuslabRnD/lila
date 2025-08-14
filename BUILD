load("@gazelle//:def.bzl", "gazelle", "gazelle_binary")
load("@rules_scala//scala:scala_toolchain.bzl", "scala_toolchain")

# foursquare/scala-gazelle
# gazelle:scala_infer_recursive_modules true
# gazelle:resolve scala scalalib.model                  @maven//:com_github_lichess_org_scalalib_scalalib_model_3
# gazelle:resolve scala play.api.libs.functional.syntax @maven//:org_playframework_play_functional_3
# gazelle:resolve scala play.api.libs.json              @maven//:org_playframework_play_json_3
# gazelle:resolve scala com.softwaremill.macwire        @maven//:com_softwaremill_macwire_macros_3
# gazelle:scala_forced_transitive_deps                  @maven//:com_softwaremill_macwire_macros_3 @maven//:com_softwaremill_macwire_util_3
# gazelle:java_exclude_artifact //app
# gazelle:exclude **/target

gazelle_binary(
    name = "scala_gazelle",
    languages = ["@scala_gazelle//scala"],
)

gazelle(
    name = "gazelle",
    data = ["//:maven_install.json"],
    gazelle = ":scala_gazelle",
)

scala_toolchain(
    name = "default_scala_toolchain",
    dependency_mode = "transitive",
    dependency_tracking_method = "ast",
    scalacopts = [
        "-indent",
        "-language:postfixOps",
        "-release:21",
        "-Wimplausible-patterns",
        "-Wunused:all",
    ],
    strict_deps_mode = "off",
)

toolchain(
    name = "scala_toolchain",
    toolchain = ":default_scala_toolchain",
    toolchain_type = "@rules_scala//scala:toolchain_type",
)
