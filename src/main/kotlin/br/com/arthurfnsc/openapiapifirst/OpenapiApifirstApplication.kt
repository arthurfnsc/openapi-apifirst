package br.com.arthurfnsc.openapiapifirst

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import springfox.documentation.swagger2.annotations.EnableSwagger2

@EnableSwagger2
@SpringBootApplication
open class OpenapiApifirstApplication

fun main(args: Array<String>) {
  runApplication<OpenapiApifirstApplication>(*args)
}

