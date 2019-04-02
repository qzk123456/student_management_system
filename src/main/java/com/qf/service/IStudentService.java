package com.qf.service;

import com.qf.entity.Student;
import com.qf.vo.StudentVo;

import java.util.List;

/**
 *
 *
 *
 */
public interface IStudentService extends IBaseService<Student>{
    //显示所有学生信息
    List<StudentVo> getAllStudents();

}
