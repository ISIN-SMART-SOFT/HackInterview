package ru.isinsmartsoft.hackinterview.app.config

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.filter.ForwardedHeaderFilter

/**
 * @author Krylov Sergey
 * @date 11.12.2022 14:49
 */
@Configuration
class WebConfig {
    @Bean
    fun forwardedHeaderFilter(): ForwardedHeaderFilter {
        return ForwardedHeaderFilter()
    }
}
