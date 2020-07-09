package com.cloud.mongo.feign.fallback;

import com.cloud.mongo.feign.api.entity.MangoEntity;
import com.cloud.mongo.feign.common.CommonResult;
import com.cloud.mongo.feign.service.ServiceFeignClient;
import org.springframework.stereotype.Component;

/**
 * @author mango
 * @date 2020/7/9 16:41
 * @description:
 */
@Component
public class ServiceFallback implements ServiceFeignClient {

    @Override
    public CommonResult hello(MangoEntity mangoEntity) {
        return CommonResult.fail();
    }
}
