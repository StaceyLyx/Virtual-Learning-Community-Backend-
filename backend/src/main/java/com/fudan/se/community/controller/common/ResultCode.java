package com.fudan.se.community.controller.common;

import lombok.Getter;

@Getter
public enum ResultCode {

    NOHANDLER("404","请求地址错误"),
    SUCCESS("200","操作成功"),
    FAILED("400","操作失败"),
    NOTOKEN("401","未登录或登录已超时"),
    NOPERMISS("403","无操作权限"),;


    private String code;
    private String message;

    ResultCode(String code, String message) {
        this.code = code;
        this.message = message;
    }
}
