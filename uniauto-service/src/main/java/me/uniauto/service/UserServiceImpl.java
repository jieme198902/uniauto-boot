package me.uniauto.service;

import com.alibaba.dubbo.config.annotation.Service;
import me.uniauto.common.BusinessCode;
import me.uniauto.common.CommResp;
import me.uniauto.mapper.SysUserMapper;
import me.uniauto.model.SysUser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by wangkuan on 2017/4/14.
 */
@Service
public class UserServiceImpl implements UserService {
    private Logger _logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private SysUserMapper sysUserMapper;

    public CommResp<SysUser> login(String name, String password) throws Exception {
        SysUser ex = new SysUser();
        ex.setAccount(name);
        CommResp commResp = new CommResp(BusinessCode.FAIL);
        SysUser userModel = sysUserMapper.selectOne(ex);
        if (null == userModel) {
            commResp.setMessage("用户不存在");
            return commResp;
        } else {
            commResp = new CommResp(BusinessCode.SUCCESS);
            commResp.setData(userModel);
        }
        _logger.warn(commResp.toString());
        return commResp;
    }
}
