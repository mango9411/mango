package com.cloud.mango.servicecopy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;

/**
 * 应用服务
 *
 * @author mango
 * @date 2020/7/9
 */

@ServletComponentScan
@EnableDiscoveryClient
@RefreshScope
@SpringBootApplication
public class ServiceCopyApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceCopyApplication.class, args);
    }
}
