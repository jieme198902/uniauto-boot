package me.uniauto.model;

import com.google.gson.Gson;

import java.io.Serializable;

/**
 * Created by wangkuan on 2017/4/14.
 */

public class UserModel implements Serializable {

    private String account;
    private String password;
    private String phone;

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
