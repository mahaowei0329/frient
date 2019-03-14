package com.harrymark.wechatapp.frientcommon.httpUtils;

/**
 * 响应结果枚举
 * Created by haoweima on 2019/3/14.
 */
public enum ResultEnum {
    SUCCESS("1001", "请求接口成功!"),

    FAILED("9999", "请求接口失败!");

    ResultEnum(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    private String code;
    private String msg;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
