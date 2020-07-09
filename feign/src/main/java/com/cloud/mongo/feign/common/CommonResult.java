package com.cloud.mongo.feign.common;

import lombok.Data;

/**
 * @author mango
 * @date 2020/7/8 21:42
 * @description:
 */
@Data
public class CommonResult {

    private String result = "Success";

    private String message;

    /**
     * 返回数据
     */
    private Object data;

    /**
     * page数
     */
    private int cntPage;

    /**
     * 返回数据总数
     */
    private long cntData;

    public static CommonResult fail() {
        CommonResult commonResult = new CommonResult();
        commonResult.setResult("fail");
        commonResult.setMessage("服务调用失败");
        return commonResult;
    }

    public static CommonResult ok() {
        CommonResult commonResult = new CommonResult();
        commonResult.setMessage("服务调用成功");
        return commonResult;
    }

    public static <T> CommonResult ok(T t) {
        CommonResult commonResult = new CommonResult();
        commonResult.setMessage("服务调用成功");
        commonResult.setData(t);
        return commonResult;
    }
}
