package com.atguigu.springcloud.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.atguigu.springcloud.entities.Payment;

/**
 * TODO
 *
 * @version V2.1
 * @since 2020/7/6 17:33
 */
@Mapper
public interface PaymentDao {

    public int add(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
