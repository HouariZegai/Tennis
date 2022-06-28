package com.houarizegai.tennis.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class Swagger2Config {

    private final ProjectProperties projectProperties;

    @Bean
    public OpenAPI apiEndpointsInfo() {
        Info info = new Info()
                .title(projectProperties.getName())
                .description(projectProperties.getDescription())
                .version(projectProperties.getVersion());

        return new OpenAPI().info(info);
    }
}
