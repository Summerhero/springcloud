package com.summer.springcloud.entries;

import javax.annotation.Resource;

/**
 * @author summer
 * @create 2023-03-08 13:00
 * @Description
 */
@Resource
public class Payment {

    // 支付ID
    private Long id;

    // 名称
    private String serial;


    /**
     * 无参构造
     */
    public Payment(){}

    /**
     * 全参构造
     * @param id
     * @param serial
     */
    public Payment(Long id,String serial){
        this.id = id;
        this.serial = serial;
    }


    @Override
    public String toString() {
        StringBuffer buffer = new StringBuffer();
        buffer.append("id = ");
        buffer.append(this.id);
        buffer.append(",serial = ");
        buffer.append(this.serial);
        return buffer.toString();
    }
}
