package com.lrj.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lrj.domain.TUser;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TUserDao extends BaseMapper<TUser> {
}
