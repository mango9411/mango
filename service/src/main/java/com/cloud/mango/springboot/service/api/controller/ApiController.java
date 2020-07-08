package com.cloud.mango.springboot.service.api.controller;

import com.cloud.mango.springboot.service.api.entity.MangoEntity;
import com.cloud.mango.springboot.service.common.CommonResult;
import com.cloud.mango.springboot.service.common.utils.CommonUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.bind.annotation.RequestBody;
/**
 * @author mango
 * @date 2020/7/8 21:38
 * @description:
 */
@RestController
@RequestMapping(value = "/api")
public class ApiController {
    @RequestMapping(value = "/hello")
    public void login(HttpServletResponse response, @RequestBody MangoEntity mangoEntity) {

        CommonResult restfulResult = new CommonResult();

        try {
            restfulResult.setData("Service1:Welcome " + mangoEntity.getName() + "!");

        } catch (Exception e) {
            e.printStackTrace();
        }

        CommonUtils.printDataJason(response, restfulResult);
    }

    @RequestMapping(value = "/rest")
    public String rest(@RequestBody MangoEntity mangoEntity){

        return "Service1:Welcome " + mangoEntity.getName() + " !";
    }
}
