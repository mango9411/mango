package com.cloud.mango.ribbon.controller;

import com.cloud.mango.ribbon.entity.MangoEntity;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author mango
 * @date 2020/7/10 11:45
 * @description:
 */
@RestController
@RequestMapping(value = "/api")
public class ApiController {

    @Resource
    RestTemplate restTemplate;

    @Value("${server.port}")
    String port;

    @RequestMapping("/consumerServiceRibbon")
    @HystrixCommand(fallbackMethod = "consumerServiceRibbonFallback")
    public String consumerServiceRibbon(@RequestBody MangoEntity mangoEntity) {
        String result = this.restTemplate.postForObject("http://spring-boot-service/api/rest", mangoEntity, String.class);
        return result;
    }

    public String consumerServiceRibbonFallback(@RequestBody MangoEntity mangoEntity) {
        return "consumerServiceRibbon异常，端口：" + port + "，Name=" + mangoEntity.getName();
    }
}
