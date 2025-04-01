# Getting Started

```shell
cd api
./gradlew :application:core:exportLibs
```

```shell
sam build --debug
```

```shell
sam build && sam deploy
```

```shell
sam build && sam local start-api --warm-containers LAZY
```