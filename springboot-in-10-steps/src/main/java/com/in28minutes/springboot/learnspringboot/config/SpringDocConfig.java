package com.in28minutes.springboot.learnspringboot.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;

@OpenAPIDefinition(
        info = @io.swagger.v3.oas.annotations.info.Info(
                title = "1212 Currency Exchange Service",
                version = "1.0",
                description = "Documentation Currency Exchange API v1.0"
        ),
        servers = {
                @io.swagger.v3.oas.annotations.servers.Server(
                        description = "Local Server",
                        url = "http://localhost:8080"
                ),
                @io.swagger.v3.oas.annotations.servers.Server(
                        description = "Staging Server",
                        url = "http://localhost:8081"
                ),
                @io.swagger.v3.oas.annotations.servers.Server(
                        description = "Production Server",
                        url = "http://localhost:8082"
                )
        },
        externalDocs = @io.swagger.v3.oas.annotations.ExternalDocumentation(
                description = "SpringDoc OpenAPI 3.0",
                url = "https://springdoc.org/"
        ),
        tags = {
                @io.swagger.v3.oas.annotations.tags.Tag(
                        name = "AA Currency Exchange",
                        description = "BBB Documentation Currency Exchange API v1.0"
                )
        },
        security = {
                @io.swagger.v3.oas.annotations.security.SecurityRequirement(
                        name = "basicAuth"
                )
        }
)
public class SpringDocConfig {
}
