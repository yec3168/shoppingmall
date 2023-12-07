package com.mall.shoppingmall.entitiy;

import lombok.Builder;
import lombok.Data;
//https://mrxx.tistory.com/104?category=828959#MemberDto%20%EC%9E%91%EC%84%B1-1
//위 사이트 참고
@Builder
@Data
public class MemberDto {

    private String name;
    private String email;
    private String phone_number;
    private String password;


    public Member toEntity(){
        return Member.builder()
                .email(email)
                .name(name)
                .phone_number(phone_number)
                .password(password).build();
    }
}
