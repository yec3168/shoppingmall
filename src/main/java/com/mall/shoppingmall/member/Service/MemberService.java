package com.mall.shoppingmall.member.Service;

import com.mall.shoppingmall.common.exception.InvalidInputException;
import com.mall.shoppingmall.member.entitiy.Member;
import com.mall.shoppingmall.member.entitiy.MemberDTO;
import com.mall.shoppingmall.member.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

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
           throw new InvalidInputException("loginId", "이미등록된 아이디입니다.");
        }


        memberRepository.save(memberDTO.toEntity());

        return "회원가입이 완료되었습니다.";
    }
}


// https://yonghwankim-dev.tistory.com/515  해당페이지참조