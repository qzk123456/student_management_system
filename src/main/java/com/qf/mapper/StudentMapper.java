package com.qf.mapper;

import com.qf.dao.IBaseDao;
import com.qf.entity.Student;

import java.util.List;

public interface StudentMapper extends IBaseDao<Student>{
    int deleteByPrimaryKey(Long id);

    int insert(Student record);

    int insertSelective(Student record);

    Student selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Student record);

    int updateByPrimaryKey(Student record);

    List<Student> getAllStudents();

}