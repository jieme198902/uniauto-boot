package me.uniauto.service;

import com.alibaba.dubbo.config.annotation.Service;
import me.uniauto.model.UserModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by wangkuan on 2017/4/14.
 */
@Service
public class UserServiceImpl implements UserService {
    private Logger _logger = LoggerFactory.getLogger(getClass());

    public UserModel login(String name, String password) throws Exception {
        UserModel userModel = new UserModel();
        userModel.setAccount(name);
        userModel.setPassword(password);

        _logger.warn(userModel.toString());

        return userModel;
    }
}
