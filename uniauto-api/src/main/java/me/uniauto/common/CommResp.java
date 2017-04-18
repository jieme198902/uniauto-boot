package me.uniauto.common;

import com.google.gson.Gson;

import java.io.Serializable;

/**
 * Created by wangkuan on 2017/4/18.
 */
public class CommResp<T> implements Serializable {
    private String code;
    private String message;
    private T data;


    public CommResp() {
    }

    public CommResp(BusinessCode businessCode) {
        this.code = businessCode.getCode();
        this.message = businessCode.getMessage();
    }

    public CommResp(BusinessCode businessCode,T data) {
        this.code = businessCode.getCode();
        this.message = businessCode.getMessage();
        this.data = data;
    }

    public CommResp(String code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
