package com.summer.springcloud.dao;

import com.summer.springcloud.entries.Payment;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Author Summer
 * @Date 2023/3/5 12:46
 * @Version 1.0
 * @Descrption
 */
@Mapper
public class PaymentDaoImpl implements PaymentDao {
    @Override
    public int add(Payment payment) {
        return 0;
    }

    @Override
    public Payment queryPaymentById(Long id) {
        return null;
    }
}
