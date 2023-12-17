package com.mall.shoppingmall.Service;

import com.mall.shoppingmall.entitiy.Member;
import com.mall.shoppingmall.entitiy.MemberDTO;
import com.mall.shoppingmall.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository memberRepository;
    //private PasswordEncoder passwordEncoder;

    public String join(MemberDTO memberDTO){
        // password 암호화하여 저장
        //memberDTO.setPassword(passwordEncoder.encode(memberDTO.getPassword()));

        Member result = memberRepository.findByMemberId(memberDTO.getMemberId());
        if (result != null){
            return "이미 등록된 아이디입니다.";
        }


        memberRepository.save(memberDTO.toEntity());

        return "회원가입이 완료되었습니다.";
    }
}


// https://yonghwankim-dev.tistory.com/515  해당페이지참조