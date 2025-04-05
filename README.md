# Getting Started

```shell
cd api
./gradlew :application:core:zipConfigurations
```

```shell
sam build --debug
```

```shell
sam build && sam deploy
```

```shell
sam build && sam local start-api --skip-pull-image --warm-containers LAZY
```

```shell
sam build && sam local start-api --skip-pull-image --warm-containers EAGER --debug-function pocLambda --debug-port 5005
```
