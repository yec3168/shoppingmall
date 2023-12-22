package com.mall.shoppingmall.common.status;

import lombok.Getter;

@Getter
public enum Gender {
    MAN("남"),
    WOMAN("여");

    private final String gender;
    Gender(String gender) {
        this.gender =gender;
    }
}
