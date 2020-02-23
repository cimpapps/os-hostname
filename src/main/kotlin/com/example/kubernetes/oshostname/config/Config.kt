package com.example.kubernetes.oshostname.config

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.http.MediaType
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter
import org.springframework.web.client.RestTemplate
import java.util.*


@Configuration
class Config {
    @Bean
    fun restTemplate(): RestTemplate {
        val restTemplate = RestTemplate()
        val converter = MappingJackson2HttpMessageConverter()
        converter.supportedMediaTypes = Collections.singletonList(MediaType.TEXT_HTML)
        restTemplate.messageConverters.add(converter)
        return restTemplate
    }
}
