package com.mall.shoppingmall.security;

import com.mall.shoppingmall.Service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.web.SecurityFilterChain;


@Configuration
public class SecurityConfig {

    @Autowired
    private MemberService memberService;

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws  Exception{
        http.csrf(AbstractHttpConfigurer::disable);

        return http.build();
    }

}
