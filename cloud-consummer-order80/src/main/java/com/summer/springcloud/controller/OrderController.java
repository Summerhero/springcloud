package com.summer.springcloud.controller;

import com.summer.springcloud.common.CommonResult;
import com.summer.springcloud.entries.Payment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author summer
 * @create 2023-03-08 12:44
 * @Description
 */
@RestController
public class OrderController {


    @Resource
    private RestTemplate restTemplate;

    // 支付模块URL
    final String PAYMENT_URL = "http://localhost:8001";

    @PostMapping("/order/add")
    public CommonResult addOrder(Payment payment){
        return restTemplate.postForObject(PAYMENT_URL + "/payment/add",payment,CommonResult.class);
    }


    @GetMapping("/order/get/{id}")
    public CommonResult<Payment> getPayment(@PathVariable("id") Long id) {
        return restTemplate.getForObject(PAYMENT_URL + "/payment/get/" + id, CommonResult.class);
    }


}
