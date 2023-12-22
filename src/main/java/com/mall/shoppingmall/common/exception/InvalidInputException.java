package com.mall.shoppingmall.common.exception;

import lombok.Getter;

@Getter
public class InvalidInputException extends RuntimeException{

    private final String fieldName;
    private final String message;

    public InvalidInputException(String fieldName, String msg) {
        this.fieldName = fieldName;
        this.message = msg;
    }
}
