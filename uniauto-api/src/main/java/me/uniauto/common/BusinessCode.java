package me.uniauto.common;

/**
 * Created by wangkuan on 2017/4/18.
 */
public enum BusinessCode {

    SUCCESS("C10000", "请求成功"),

    FAIL("C10001", "请求失败"),;
    private String code, message;

    BusinessCode(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
