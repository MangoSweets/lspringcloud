package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import com.atguigu.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @describtion:
 * @author: yejun
 * @time: 2020/7/8
 */
@RestController
@Slf4j
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @PostMapping(value = "/payment/add")
    public CommonResult add(@RequestBody Payment payment) {
        int result = paymentService.add(payment);
        log.info("插入结果" + result);
        if (result > 0) {
            return new CommonResult(200, "插入数据库成功", result);
        }
        return new CommonResult(444, "插入数据库失败", null);
    }

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id) {
        Payment paymentById = paymentService.getPaymentById(id);
        log.info("查询结果" + paymentById);
        if (paymentById != null) {
            return new CommonResult(200, "查询数据库成功", paymentById);
        }
        return new CommonResult(444, "查询数据库失败", null);
    }
}
