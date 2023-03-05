package com.summer.springcloud.common;

import lombok.Data;

/**
 * @Author Summer
 * @Date 2023/3/5 12:54
 * @Version 1.0
 * @Descrption
 */
@Data
public class CommonResult<T> {

    // 返回码
    private int code;

    // 描述信息
    private String message;

    // 返回数据
    private T data;


    /**
     * 无参构造
     */
    public CommonResult() {}

    /**
     * 全参构造
     * @param code  返回码
     * @param message   描述信息
     * @param data  返回数据
     */
    public CommonResult(Integer code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    /**
     * 无结果数据构造
     * @param code  返回码
     * @param message   描述信息
     */
    public CommonResult(Integer code, String message) {
        this(code, message, null);
    }



}
