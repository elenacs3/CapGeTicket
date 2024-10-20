package com.capgeticket.resteventos.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;

@Configuration
public class OpenApiConfig {
	
	
    @Bean
    public OpenAPI openApi() {
        return new OpenAPI()
                .info(new Info()
                        .title("CapgeTicket API")
                        .description("Documentation for CapgeTicket API")
                        .version("v1.0")
                        .contact(new Contact()
                                .name("Laura Gregorio, Laura Cordero, Elena Cantonero, Guillermo García, Veronica Parra")
                                .url("https://asbnotebook.com")
                                .email("asbnotebook@gmail.com"))
                        .termsOfService("TOC")
                        .license(new License().name("LICENSE").url("http://springdoc.org"))
                );
    }
	

}
