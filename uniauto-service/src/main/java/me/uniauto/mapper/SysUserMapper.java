package me.uniauto.mapper;

import me.uniauto.conf.MyMapper;
import me.uniauto.model.SysUser;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SysUserMapper extends MyMapper<SysUser> {
}