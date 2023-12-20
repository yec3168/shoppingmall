package com.mall.shoppingmall.controller;

import com.mall.shoppingmall.Service.MemberService;
import com.mall.shoppingmall.entitiy.MemberDTO;
import com.mall.shoppingmall.entitiy.MemberDetails;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
    public String createMember(MemberDTO memberDTO){
        Long memberId = memberService.join(memberDTO);
        System.out.println("memberId : " + memberId);
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
        return "redirect:/";
    }
}
