package com.summer.springcloud.dao;

import com.summer.springcloud.entries.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @author summer
 * @create 2023-03-04 17:26
 * @Description 支付Dao
 */
//@Repository   被Mapper替代
@Mapper
public interface PaymentDao {

    // 新增支付信息

    public int add(Payment payment);

    // 根据支付ID查询支付信息
    //public Payment queryPaymentById(@Param("id"),Long id);
    public Payment queryPaymentById(Long id);
}
