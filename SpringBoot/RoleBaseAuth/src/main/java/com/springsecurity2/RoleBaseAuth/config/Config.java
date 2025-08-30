package com.springsecurity2.RoleBaseAuth.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableMBeanExport;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.util.matcher.AndRequestMatcher;
import org.springframework.util.AntPathMatcher;

@Configuration
@EnableWebSecurity
@EnableMethodSecurity
public class Config {
    @Bean
  public   UserDetailsService userDetailsService(PasswordEncoder passwordEncoder)
    {
        UserDetails admin = User.withUsername("adnan")
                .password(passwordEncoder.encode("1234"))
                .roles("ADMINISTRATOR") // matches @PreAuthorize
                .build();

        UserDetails user = User.withUsername("iqra")
                .password(passwordEncoder.encode("123"))
                .roles("CUSTOMER") // matches @PreAuthorize
                .build();

        return new InMemoryUserDetailsManager(admin, user);
    }


    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
  @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {
      httpSecurity.csrf(e->e.disable()).
              authorizeHttpRequests(auth->auth
                      .anyRequest().authenticated())
              .formLogin(Customizer.withDefaults()).httpBasic(Customizer.withDefaults());
      return  httpSecurity.build();

  }

}
