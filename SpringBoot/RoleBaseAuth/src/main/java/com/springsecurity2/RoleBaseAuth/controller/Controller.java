package com.springsecurity2.RoleBaseAuth.controller;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/api")
public class Controller {

    @PreAuthorize("hasAnyRole('ADMINISTRATOR','CUSTOMER')")
    @GetMapping("/m1")
    public String userKaMethod()
    {
        return "admin user dono accessible";
    }
    @PreAuthorize("hasRole('ADMINISTRATOR')")
    @GetMapping("/m2")
    public String adminKaMethod()
    {
        return "admin only accessible";
    }

}
