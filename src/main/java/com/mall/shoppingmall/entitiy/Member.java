package com.mall.shoppingmall.entitiy;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor // 파라미터가 없는 디폴트 생성자를 생성
@Getter
@Entity
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // PK

    @Column(length = 100, nullable = false)
    private String name; // 이름

    @Column(length = 100, nullable = false, unique = true)
    private String email; // email address

    @Column(length = 100, nullable = false, unique = true )
    private String phone_number; //phone_number

    @Column(length = 100, nullable = false)
    private String password; //password

    @Builder
    public Member(String name, String email, String phone_number, String password){
        this.name = name;
        this.email = email;
        this.phone_number = phone_number;
        this.password = password;
    }
}
