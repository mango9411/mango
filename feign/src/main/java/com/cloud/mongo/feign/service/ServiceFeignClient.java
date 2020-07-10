package com.cloud.mongo.feign.service;

import com.cloud.mongo.feign.api.entity.MangoEntity;
import com.cloud.mongo.feign.common.CommonResult;
import com.cloud.mongo.feign.fallback.ServiceFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author mango
 * @date 2020/7/9 16:33
 * @description: FeignClient的value对应调用服务的spring.application.name
 */
@Component
@FeignClient(value = "spring-boot-service", fallback = ServiceFallback.class)
public interface ServiceFeignClient {

    /**
     * 调用业务应用
     *
     * @param mangoEntity
     * @return
     */
    @RequestMapping(value = "/api/hello")
    CommonResult hello(@RequestBody MangoEntity mangoEntity);
}
