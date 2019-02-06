### Dagger + Bazel Example

This is a very simple dagger 2 + bazel example.

```bash
bazel test //:theater_test
bazel build //:theater_deploy.jar
java -jar bazel-bin/theater_deploy.jar
```
