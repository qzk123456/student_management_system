package com.qf.controller;

import com.qf.entity.Class;
import com.qf.entity.Student;
import com.qf.service.IClassService;
import com.qf.service.IStudentService;
import com.qf.vo.StudentVo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 *
 *
 *
 */
@Controller
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private IStudentService studentService;
    @Autowired
    private IClassService classService;

    //显示所有学生
    @RequestMapping("/show")
    public String show(ModelMap map){
        List<StudentVo> students = studentService.getAllStudents();
        map.put("students", students);
        return "student/student_list";
    }

    //跳转添加页面
    @RequestMapping("/toAdd")
    public String toAdd(){
        return "student/student_add";
    }

    //保存添加
    @RequestMapping("/add")
    public String add(Student student){
        int count = studentService.insertSelective(student);
        if (count>0) {
            return "redirect:show";
        }
        return null;
    }

    //编辑回显
    @RequestMapping("/toUpdate")
    public String toUpdate(Long id, ModelMap map){
        StudentVo studentVo = new StudentVo();
        Student student = studentService.selectByPrimaryKey(id);
        Class c = classService.selectByPrimaryKey(student.getClassId());
        BeanUtils.copyProperties(student, studentVo);
        studentVo.setClassName(c.getName());
        map.put("student", studentVo);
        return "student/student_update";
    }

    //保存修改
    @RequestMapping("/update")
    public String update(Student student){
        int count = studentService.updateByPrimaryKeySelective(student);
        if (count>0) {
            return "redirect:show";
        }
        return null;
    }

    //删除
    @RequestMapping("/del")
    public String del(Long id){
        int count = studentService.deleteByPrimaryKey(id);
        if (count>0) {
            return "redirect:show";
        }
        return null;
    }


}
