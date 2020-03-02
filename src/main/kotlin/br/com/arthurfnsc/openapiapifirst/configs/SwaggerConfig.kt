package br.com.arthurfnsc.openapiapifirst.configs

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import springfox.documentation.builders.ApiInfoBuilder
import springfox.documentation.builders.RequestHandlerSelectors
import springfox.documentation.service.ApiInfo
import springfox.documentation.spi.DocumentationType
import springfox.documentation.spring.web.plugins.Docket

@Configuration
open class SwaggerConfig {

    @Bean
    open fun docket(): Docket =
        Docket(DocumentationType.SWAGGER_2)
            .select()
            .apis(RequestHandlerSelectors.basePackage("br.com.arthurfnsc.openapiapifirst.apis.impl"))
            .build()
            .apiInfo(this.getApiInfo())

    private fun getApiInfo(): ApiInfo {

        val description = StringBuilder("")

        return ApiInfoBuilder()
            .title("Bands REST API")
            .description(description.toString())
            .version("1.0.0")
            .build()
    }
}
