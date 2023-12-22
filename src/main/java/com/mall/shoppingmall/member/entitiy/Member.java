package com.mall.shoppingmall.member.entitiy;

import com.mall.shoppingmall.common.status.Gender;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@NoArgsConstructor // 파라미터가 없는 디폴트 생성자를 생성
@AllArgsConstructor
@Builder
@Data
@Entity
@Table(name = "Member")
public class Member  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long memberIndex; // PK

    @Column(length = 100, nullable = false, unique = true)
    private String memberId;

    @Column(length = 100, nullable = false)
    private String name; // 이름

    @Column(length = 100, nullable = false)
    private String password; //password

    @Column(length = 10, nullable = false)
    @Enumerated(EnumType.STRING) // enum형을 데이터 베이스에 어떻게 저장할지
    private Gender gender;

    @Column(length = 100, nullable = false)
    private String email; // email address


    // cascadeType.remove사용으로 모두 삭제시킴
    //@OneToMany(mappedBy = "member", cascade = CascadeType.REMOVE)
    //private List<Order> orderList; // 주문 리스트
}
