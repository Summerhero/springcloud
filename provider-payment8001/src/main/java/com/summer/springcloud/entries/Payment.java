package com.summer.springcloud.entries;

import lombok.Data;

/**
 * @author summer
 * @create 2023-03-04 17:27
 * @Description 支付实体类,对应数据库 支付订单表
 */
@Data
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
