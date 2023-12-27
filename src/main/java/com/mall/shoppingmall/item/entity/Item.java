package com.mall.shoppingmall.item.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
public class Item {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long itemId; // 상품 번호

    private String itemName; //상품 이름

    private int itemPrice; // 상품 가격

    private String stockNumber; // 재고수량

    private String itemDetails; // 상품 설명


    // 상품 판매상태


}
