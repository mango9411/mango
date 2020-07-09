package com.cloud.mango.springboot.service.common.utils;


import javax.servlet.http.HttpServletResponse;

/**
 * @author mango
 * @date 2020/7/8 21:45
 * @description:
 */
public class CommonUtils {

    /**
     * JSON格式化
     *
     * @param response
     * @param item
     * @return
     */
    public static String printDataJason(HttpServletResponse response,
                                        Object item) {
        try {

            JsonUtils.renderString(response, item);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    /**
     * 随机生成6位随机验证码
     *
     * @param len
     * @return
     */
    public static String createRandomVcode(int len) {
        // 验证码
        String vcode = "";
        for (int i = 0; i < len; i++) {
            vcode = vcode + (int) (Math.random() * 9);
        }
        return vcode;
    }
}
