package com.cloud.mongo.feign.api.controller;

import com.cloud.mongo.feign.api.entity.MangoEntity;
import com.cloud.mongo.feign.common.CommonResult;
import com.cloud.mongo.feign.common.utils.CommonUtils;
import com.cloud.mongo.feign.service.ServiceFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

/**
 * @author mango
 * @date 2020/7/8 21:38
 * @description:
 */
@RestController
@RequestMapping(value = "/api")
public class ApiController {

    @Autowired
    private ServiceFeignClient serviceFeignClient;

    @RequestMapping("/consumerService")
    public void consumerService(@RequestBody MangoEntity mangoEntity, HttpServletResponse response) {

        CommonUtils.printDataJason(response, CommonResult.ok(serviceFeignClient.hello(mangoEntity)));
    }
}
