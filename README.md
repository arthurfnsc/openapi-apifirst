# openapi-apifirst

Implementation using
[OpenAPI 3.0](https://github.com/OAI/OpenAPI-Specification), Spring Boot,
Kotlin, Gradle and Maven

## Execution

### Clone

```console
foo@bar:~$ git clone https://github.com/arthurfnsc/openapi-apifirst.git
foo@bar:~$ cd openapi-apifirst
```

### Linux | Windows Gradle execution

```console
foo@bar:~$ [./gradlew | gradlew.bat] clean bootRun
```

### Linux | Windows Maven execution

```console
foo@bar:~$ [./mvnw | mvnw.cmd] clean spring-boot:run 
```

## Structure

```console
openapi-apifirst
|-- ".mvn"
|   `-- "wrapper"
|       |-- "maven-wrapper.jar"
|       |-- "maven-wrapper.properties"
|       `-- "MavenWrapperDownloader.java"
|-- "build"
|    `-- "generated"
|        |-- "openapi-code-client"
|        |   `-- "src"
|        |       `-- "main"
|        |           `-- "java"
|        `-- "openapi-code-server"
|            `-- "src"
|                `-- "main"
|                    `-- "java"
|-- "gradle"
|   `-- "wrapper"
|       |-- "gradle-wrapper.jar"
|       `-- "gradle-wrapper.properties"
|-- "plugins"
|   |-- "ides.gradle"
|   |-- "kotlin.gradle"
|   `-- "openapi.gradle"
|-- "src"
|   `-- "main"
|       |-- "kotlin"
|       |   `-- "br"
|       |        `-- "com"
|       |            `-- "arthurfnsc"
|       |                `-- "openapipifirst"
|       |                    |-- "apis"
|       |                    |   `-- "impl"
|       |                    |       `-- "BandApiImpl.kt"
|       |                    |-- "configs"
|       |                    |   `-- "SwaggerConfig.kt"
|       |                    `-- "OpenapiApifirstApplication.kt"
|       `-- "resources"
|           |-- "application.yaml"
|           |-- "application-dev.yaml"
|           |-- "application-hom.yaml"
|           `-- "application-prd.yaml"
|-- "target"
|    `-- "generated-sources"
|        |-- "openapi-code-client"
|        |   `-- "src"
|        |       `-- "main"
|        |           `-- "java"
|        `-- "openapi-code-server"
|            `-- "src"
|                `-- "main"
|                    `-- "java"
|-- ".gitignore"
|-- "build.gradle"
|-- "gradlew"
|-- "gradlew.bat"
|-- "mvnw"
|-- "mvnw.cmd"
|-- "pom.xml"
|-- "README.md"
`-- "settings.gradle"
```

## Architecture

- [Gradle](https://gradle.org/)
- [Kotlin](https://kotlinlang.org/)
- [Maven](https://maven.apache.org/)
- [OpenAPI Generator](https://github.com/OpenAPITools/openapi-generator)
- [OpenAPI Generator Gradle](https://github.com/OpenAPITools/openapi-generator/tree/master/modules/openapi-generator-gradle-plugin)
- [OpenAPI Generator Maven](https://github.com/OpenAPITools/openapi-generator/tree/master/modules/openapi-generator-maven-plugin)
- [Spring Boot 2.2](https://projects.spring.io/spring-boot/)
