package ru.isinsmartsoft.hackinterview.app.config

import io.swagger.v3.oas.models.OpenAPI
import io.swagger.v3.oas.models.info.Info
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

/**
 * @author Krylov Sergey
 * @date 11.12.2022 14:43
 */
@Configuration
class SwaggerConfig {

    @Bean
    fun customOpenAPI(): OpenAPI {
        return OpenAPI()
            .info(
                Info()
                    .title("Hack Interview")
                    .version("1.0.0")
                    .description("todo")
            )
    }
}
