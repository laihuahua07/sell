package com.lhhclazz.sell.enums;

import lombok.Getter;

/**
 * 支付状态枚举
 */
@Getter
public enum PayStatusEnum {

    WAIT(0,"未支付"),
    SUCCESS(1,"已支付"),
    ;
    private Integer code;

    private String msg;

    PayStatusEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
