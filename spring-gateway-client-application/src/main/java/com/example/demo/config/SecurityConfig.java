package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.web.server.ServerHttpSecurity;
import org.springframework.security.web.server.SecurityWebFilterChain;

@Configuration
public class SecurityConfig 
{
	@Bean
	public SecurityWebFilterChain  securityWebFilterChain(ServerHttpSecurity http) 
	{
		http
		.authorizeExchange()
		.pathMatchers("/actuator/**")
		.permitAll()
		.and()
		.authorizeExchange()
		.anyExchange()
		.authenticated()
		.and()
		.oauth2Login();
		
		return http.build();
	}
}
