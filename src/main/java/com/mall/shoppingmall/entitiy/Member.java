package com.mall.shoppingmall.entitiy;

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

    @Column(length = 100, nullable = false)
    private String email; // email address


    // cascadeType.remove사용으로 모두 삭제시킴
    //@OneToMany(mappedBy = "member", cascade = CascadeType.REMOVE)
    //private List<Order> orderList; // 주문 리스트
}
