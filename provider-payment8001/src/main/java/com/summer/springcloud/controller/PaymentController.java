package com.summer.springcloud.controller;

import com.summer.springcloud.common.CommonResult;
import com.summer.springcloud.entries.Payment;
import com.summer.springcloud.service.PaymentService;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author Summer
 * @Date 2023/3/5 12:51
 * @Version 1.0
 * @Descrption
 */
@RestController
public class PaymentController {

    private PaymentService paymentService;
    /**
     * 新增支付信息
     * @param payment   支付对象
     * @return  1 成功 反之失败
     */
    public int add(Payment payment){
        // 参数校验 TODO
        int rowNums = paymentService.add(payment);
//        if(rowNums < 1){
//            return new CommonResult<>(500,"增加支付信息失败");
//        }
//        return new CommonResult<>();
        return rowNums;
    }

    /**
     * 根据支付ID查询支付信息
     * @param id    支付ID
     * @return      支付信息
     */
    public Payment queryPaymentById(@Param("id")  Long id){
        // 参数校验 TODO
        Payment payment = paymentService.queryPaymentById(id);
//        if(null == payment){
//            return new CommonResult<>(500,"查询失败，ID：" + id);
//        }
//        return new CommonResult<>(200,"查询成功，ID：" + id,payment);
        return payment;
    }
}
