package com.instagram.Instagram.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class Instagram {
 @Autowired
    Reels reels;
  @Autowired
    LocalDateTime localDateAndTime; // predefine class k liye  hm @Configuration k sth @Bean use krte  h
    public void play()
    {
        System.out.println("Current time"+localDateAndTime);
        reels.dance();
    }
}
