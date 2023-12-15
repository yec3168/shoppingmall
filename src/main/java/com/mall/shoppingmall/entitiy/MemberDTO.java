package com.mall.shoppingmall.entitiy;

import lombok.Data;

@Data
public class MemberDTO {

    private String memberId;
    private String name;
    private String password;
    private String email;

    //파라미터 주입
    public Member toEntity(){
        return Member.builder()
                .memberId(memberId)
                .name(name)
                .password(password)
                .email(email).
                build();
    }
}
