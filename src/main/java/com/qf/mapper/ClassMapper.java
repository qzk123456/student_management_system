package com.qf.mapper;

import com.qf.entity.Class;

public interface ClassMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Class record);

    int insertSelective(Class record);

    Class selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Class record);

    int updateByPrimaryKey(Class record);
}