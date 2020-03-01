# openapi-apifirst

Implementação utilizando
[OpenAPI 3.0](https://github.com/OAI/OpenAPI-Specification), Spring Boot,
Kotlin, Gradle e Maven

## Execução

### Clone

```console
foo@bar:~$ git clone https://github.com/arthurfnsc/openapi-apifirst.git
foo@bar:~$ cd openapi-apifirst
```

### Execução Gradle Linux | Windows

```console
foo@bar:~$ [./gradlew | gradlew.bat] clean bootRun
```

## Estrutura

```console
openapi-apifirst
|   `-- "build"
|       `-- "generated"
|           |-- "openapi-code-client"
|           |   `-- "src"
|           |       `-- "main"
|           |           `-- "java"
|           `-- "openapi-code-server"
|               `-- "src"
|                   `-- "main"
|                       `-- "java"
|-- "src"
|   `-- "main"
|       |-- "kotlin"
|       |   `-- "br"
|       |        `-- "com"
|       |            `-- "arthurfnsc"
|       |                `-- "openapipifirst"
|       |                    `-- "OpenapiApifirstApplication.kt"
|       `-- "resources"
|           |-- "application.yaml"
|           |-- "application-dev.yaml"
|           |-- "application-hom.yaml"
|           `-- "application-prd.yaml"
|-- "build.gradle"
|-- "gradle"
|   `-- "wrapper"
|       |-- "gradle-wrapper.jar"
|       `-- "gradle-wrapper.properties"
|-- "gradlew"
|-- "gradlew.bat"
|-- "plugins"
|   |-- "ides.gradle"
|   |-- "kotlin.gradle"
|   `-- "openapi.gradle"
|-- "README.md"
`-- "settings.gradle"
```

## Architecture

- [Gradle](https://gradle.org/)
- [Kotlin](https://kotlinlang.org/)
- [OpenAPI Generator](https://github.com/OpenAPITools/openapi-generator)
- [Spring Boot 2.2](https://projects.spring.io/spring-boot/)
