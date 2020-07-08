package com.atguigu.springcloud.service;

import com.atguigu.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @describtion:
 * @author: yejun
 * @time: 2020/7/8
 */
public interface PaymentService {
     int add(Payment payment);

     Payment getPaymentById(@Param("id") Long id);
}
