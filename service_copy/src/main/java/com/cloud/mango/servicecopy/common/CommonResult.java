package com.cloud.mango.servicecopy.common;

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
}
