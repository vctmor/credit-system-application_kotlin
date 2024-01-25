package me.dio.credit.application.system.configuration

import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Bean
import org.springdoc.core.models.GroupedOpenApi

@Configuration
class Swagger3Config {
    @Bean
    fun publicApi(): GroupedOpenApi? {
        return GroupedOpenApi.builder()
            .group("springcreditapplicationsystem-public")
            .pathsToMatch("/api/customers/**", "/api/credits/**")
            .build()
    }
}