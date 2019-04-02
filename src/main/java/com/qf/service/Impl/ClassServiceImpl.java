package com.qf.service.Impl;

import com.qf.dao.IBaseDao;
import com.qf.entity.Class;
import com.qf.mapper.ClassMapper;
import com.qf.service.IClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *
 *
 *
 */
@Service
public class ClassServiceImpl extends BaseServiceImpl<Class> implements IClassService{

    @Autowired
    private ClassMapper classMapper;

    @Override
    public IBaseDao<Class> getDao() {
        return classMapper;
    }
    //显示所有班级
    @Override
    public List<Class> getAllClass() {
        return classMapper.getAllClass();
    }
}
