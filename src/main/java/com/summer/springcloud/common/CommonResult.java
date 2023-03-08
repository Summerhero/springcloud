package com.summer.springcloud.common;

import javax.annotation.Resource;

/**
 * @author summer
 * @create 2023-03-08 12:46
 * @Description
 */
@Resource
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
