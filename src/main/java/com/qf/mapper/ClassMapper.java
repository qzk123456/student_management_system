package com.qf.mapper;

import com.qf.dao.IBaseDao;
import com.qf.entity.Class;

import java.util.List;

public interface ClassMapper extends IBaseDao<Class>{

    int deleteByPrimaryKey(Long id);

    int insert(Class record);

    int insertSelective(Class record);

    Class selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Class record);

    int updateByPrimaryKey(Class record);
    //显示所有班级
    List<Class> getAllClass();
}