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

    public Boolean findByMemberId(String memberId){
        memberRepository.findByMemberId(memberId).ifPresent(member -> {
            throw new IllegalStateException("이미존재회원입니다");
        });
        return false;
    }

    public Long join(MemberDTO memberDTO){
        // password 암호화하여 저장
        //memberDTO.setPassword(passwordEncoder.encode(memberDTO.getPassword()));

        boolean result = findByMemberId(memberDTO.getMemberId());
        System.out.println(result);

        if(!result) {
            memberRepository.save(memberDTO.toEntity());
        }
        return memberDTO.toEntity().getMemberIndex();
    }
}
