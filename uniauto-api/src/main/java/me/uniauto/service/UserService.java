package me.uniauto.service;

import me.uniauto.model.UserModel;

/**
 * Created by wangkuan on 2017/4/14.
 */
public interface UserService {

    UserModel login(String name, String password) throws Exception;
}
