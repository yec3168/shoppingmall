package com.mall.shoppingmall.entitiy;

import jakarta.persistence.*;



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

}
