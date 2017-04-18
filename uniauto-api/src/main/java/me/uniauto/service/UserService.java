package me.uniauto.service;

import me.uniauto.common.CommResp;
import me.uniauto.model.SysUser;

/**
 * Created by wangkuan on 2017/4/14.
 */
public interface UserService {

    CommResp<SysUser> login(String name, String password) throws Exception;
}
