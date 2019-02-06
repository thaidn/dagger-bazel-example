java_binary(
    name = "theater",
    srcs = glob(["src/main/java/**/*.java"]),
    main_class = "org.drewolson.theater.Main",
    deps = [
        "@com_google_dagger//:dagger_with_compiler",
    ]
)

java_test(
    name = "theater_test",
    srcs = glob([
        "src/main/java/**/*.java",
        "src/test/java/**/*.java",
    ]),
    test_class = "org.drewolson.theater.AllTests",
    deps = [
        "@com_google_dagger//:dagger_with_compiler",
    ],
    runtime_deps = [
        "@junit_junit//jar",
    ]
)
