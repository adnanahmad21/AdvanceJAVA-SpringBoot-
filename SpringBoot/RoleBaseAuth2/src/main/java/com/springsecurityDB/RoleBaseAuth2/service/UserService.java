package com.springsecurityDB.RoleBaseAuth2.service;

import com.springsecurityDB.RoleBaseAuth2.entity.UserDetail;
import com.springsecurityDB.RoleBaseAuth2.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class UserService implements UserDetailsService {

    @Autowired
    private UserRepo userRepo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserDetail userDetail = userRepo.findByEmail(username)
                .orElseThrow(() -> new UsernameNotFoundException("User Not Found"));

        return User.withUsername(userDetail.getEmail())
                .password(userDetail.getPassword())
                .roles(userDetail.getRole())  // role add kiya
                .build();
    }

//    public Optional<UserDetail> findEmail(String email) {
//        return userRepo.findByEmail(email);
//    }
}
