package com.mall.shoppingmall.entitiy;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderId;

    @ManyToOne
    private Member member ; // 주문 회원

    @Column(length = 100, nullable = false)
    private String orderState; // 주문 상태

    private LocalDateTime orderDate; // 주문 시간

}
