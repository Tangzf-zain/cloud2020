package com.atguigu.springcloud.controlller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.annotation.Resource;
import java.util.List;
import java.util.UUID;

@Controller
@Slf4j
public class PaymentController {

    @Value("${server.port}")
    private String serverPort;


    @GetMapping(value = "/payment/zk")
    public String discovery(){
        return "springcloud with zookeeper :"+serverPort+"\t" + UUID.randomUUID().toString();
    }

}
