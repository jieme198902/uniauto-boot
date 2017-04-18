package me.uniauto.conf;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * Created by wangkuan on 2017/4/18.
 */
public interface MyMapper <T> extends Mapper<T>, MySqlMapper<T> {

}