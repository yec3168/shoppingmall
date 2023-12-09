package com.mall.shoppingmall.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PageController {
    // main homepage
    @GetMapping("/")
    public String home(){
        return "index";
    }

    //회원가입
    @GetMapping("/auth/signup")
    public String signup(){
        return "auth/signup";
    }



    // 로그인
    //https://webfirewood.tistory.com/115
    @GetMapping("/auth/login")
    public String login(){
        return "auth/login";
    }

    //회원가입 성공시
    @GetMapping("/auth/complete")
    public String complete(){
        return "auth/complete";
    }
}
