package com.springsecurity.SpringSecurity.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

import static org.springframework.security.config.Customizer.withDefaults;

@Configuration
@EnableWebSecurity
public class Config {
    @Bean
    public   SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {
//        httpSecurity.authorizeHttpRequests(auth -> auth.requestMatchers("api","/m1").permitAll()
//                .anyRequest().authenticated()).formLogin(withDefaults()).httpBasic(withDefaults());
//        return httpSecurity.build();
        httpSecurity.authorizeHttpRequests(auth -> auth
                        .requestMatchers("/api/m1").permitAll() // allow access without login
                        .anyRequest().authenticated()
                ).formLogin(withDefaults())
                .httpBasic(withDefaults());
 return  httpSecurity.build();
    }
}
