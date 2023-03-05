package com.summer.springcloud.service;

import com.summer.springcloud.dao.PaymentDao;
import com.summer.springcloud.entries.Payment;
import org.apache.ibatis.annotations.Param;

import javax.annotation.Resource;

/**
 * @Author Summer
 * @Date 2023/3/5 12:47
 * @Version 1.0
 * @Descrption
 */
public interface PaymentService {
    /**
     * 新增支付信息
     * @param payment   支付对象
     * @return  1 成功 反之失败
     */
    public int add(Payment payment);

    /**
     * 根据支付ID查询支付信息
     * @param id    支付ID
     * @return      支付信息
     */
    public Payment queryPaymentById(@Param("id")  Long id);
}
