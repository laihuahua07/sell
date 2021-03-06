package com.lhhclazz.sell.exception;

import com.lhhclazz.sell.enums.ResultEnum;

/**
 * 自定义异常
 */
public class SellException extends RuntimeException {

    private Integer code;

    public SellException(ResultEnum resultEnum){
        super(resultEnum.getMsg());
        this.code = resultEnum.getCode();
    }

    public SellException(Integer code,String message){
        super(message);
        this.code = code;
    }
}
