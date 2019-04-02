package com.qf.service.Impl;

import com.qf.dao.IBaseDao;
import com.qf.entity.Class;
import com.qf.entity.Student;
import com.qf.mapper.ClassMapper;
import com.qf.mapper.StudentMapper;
import com.qf.service.IStudentService;
import com.qf.vo.StudentVo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 *
 *
 *
 */
@Service
public class StudentServiceImpl extends BaseServiceImpl<Student> implements IStudentService{

    @Autowired
    private StudentMapper studentMapper;
    @Autowired
    private ClassMapper classMapper;

    @Override
    public IBaseDao<Student> getDao() {
        return studentMapper;
    }

    @Override
    public List<StudentVo> getAllStudents() {
        List<StudentVo> voList = new ArrayList<>();
        List<Student> list = studentMapper.getAllStudents();
        for (Student student:list) {
            Class c = classMapper.getClassById(student.getClassId());
            StudentVo studentVo = new StudentVo();
            BeanUtils.copyProperties(student,studentVo);
            studentVo.setClassName(c.getName());
            voList.add(studentVo);
        }
        return voList;
    }
}
