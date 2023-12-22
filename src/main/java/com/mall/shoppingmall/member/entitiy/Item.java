package com.mall.shoppingmall.member.entitiy;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long itemId;

    @Column(length = 100, nullable = false)
    private String itemName;

    @Column(name = "price", nullable = false)
    private int itemPrice;

    @Column(nullable = false)
    private String itemDetail;

    @Lob // 데베 저장하는 길이인 255개 이상문자를 저장하고 싶을때 지정
    @Column(nullable = false)
    private int stockNumber; // 재고수량
}
