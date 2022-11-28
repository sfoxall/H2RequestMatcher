package com.inventivum.h2requestmatchers.config;

import org.springframework.boot.autoconfigure.web.ServerProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

import static org.springframework.security.web.util.matcher.AntPathRequestMatcher.antMatcher;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http, ServerProperties serverProperties)
            throws Exception {

        // Enable anonymous
        http.anonymous();

        // Disable CORS
        http.cors().disable();

        // Route security: deny all routes accept Swagger-UI and H2-Console. But /h2-console returns a 403
        http.authorizeHttpRequests((authorize) -> authorize
                .requestMatchers( "/h2-console/**").permitAll()
                .requestMatchers( "/v3/api-docs/**").permitAll()
                .requestMatchers( "/swagger-ui/**").permitAll()
                .requestMatchers("/**").denyAll());

        // This configuration works fine
//        http.authorizeHttpRequests((authorize) -> authorize
//                .requestMatchers(antMatcher( "/h2-console/**")).permitAll()
//                .requestMatchers(antMatcher( "/v3/api-docs/**")).permitAll()
//                .requestMatchers(antMatcher( "/swagger-ui/**")).permitAll()
//                .requestMatchers(antMatcher("/**")).denyAll());

        return http.build();
    }
}

