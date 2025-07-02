package com.instagram.Instagram.config;

import com.instagram.Instagram.beans.Reels;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDateTime;
@Configuration
public class InstaConfig {
    @Bean
    public LocalDateTime getTime()
    {
        return LocalDateTime.now();
    }
//    @Bean
//    public Reels getReels()
//    {
//        return new Reels();
//
//    }
}
