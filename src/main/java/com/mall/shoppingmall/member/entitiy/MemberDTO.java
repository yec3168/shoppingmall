package com.mall.shoppingmall.member.entitiy;

import com.mall.shoppingmall.common.status.Gender;
import lombok.Data;

@Data
public class MemberDTO {

    private String memberId;
    private String name;
    private String password;
    private Gender gender;
    private String email;

    //파라미터 주입
    public Member toEntity(){
        return Member.builder()
                .memberId(memberId)
                .name(name)
                .password(password)
                .gender(gender)
                .email(email).
                build();
    }
}
