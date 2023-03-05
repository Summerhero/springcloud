package com.summer.springcloud.service;

import com.summer.springcloud.dao.PaymentDao;
import com.summer.springcloud.entries.Payment;

import javax.annotation.Resource;

/**
 * @Author Summer
 * @Date 2023/3/5 12:48
 * @Version 1.0
 * @Descrption
 */
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;

    @Override
    public int add(Payment payment) {
        return paymentDao.add(payment);
    }

    @Override
    public Payment queryPaymentById(Long id) {
        return paymentDao.queryPaymentById(id);
    }
}
