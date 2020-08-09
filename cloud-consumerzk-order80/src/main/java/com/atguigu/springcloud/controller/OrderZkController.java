package com.atguigu.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@Controller
@Slf4j
public class OrderZkController {

    public static final String PAYMENT_URL="http://CLOUD-PAYMENT-SERVICE";

    @Resource
    private RestTemplate restTemplate;

    @GetMapping(value = "/consumer/payment/zk")
    public String paymentInfo(){
        log.info("11");
        String result = restTemplate.getForObject(PAYMENT_URL+"/payment/zk",String.class);
        return result;
    }
}
