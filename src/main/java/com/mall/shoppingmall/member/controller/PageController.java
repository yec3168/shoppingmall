package com.mall.shoppingmall.member.controller;

import com.mall.shoppingmall.member.Service.MemberService;
import com.mall.shoppingmall.member.entitiy.MemberDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RequiredArgsConstructor
@Controller
public class PageController {
    private final MemberService memberService;
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

    // summit버튼을 통해 MemberDTO에 데이터 저장
    @PostMapping("/auth/signup")
    public String createMember(@RequestBody MemberDTO memberDTO){
        String result = memberService.join(memberDTO);
        System.out.println("회원가입 결과 : " + result);
        return"auth/complete";
    }

//    @GetMapping("/error")
//    public String error(){
//        return "auth/error";
//    }

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
