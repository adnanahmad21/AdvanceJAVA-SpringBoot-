package com.springsecurityDB.RoleBaseAuth2.controller;

import com.springsecurityDB.RoleBaseAuth2.entity.UserDetail;
import com.springsecurityDB.RoleBaseAuth2.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class Controller {

    @Autowired
    private UserService userService;

    @GetMapping("/m1")
    public String m1() {
        return "admin only accessible";
    }

    @GetMapping("/m2")
    public String m2() {
        return "admin and user both accessible";
    }
//
//    @GetMapping("/m3")
//    public Optional<UserDetail> m3() {
//        return userService.findEmail("adnan21122001@gmail.com");
//    }
}
