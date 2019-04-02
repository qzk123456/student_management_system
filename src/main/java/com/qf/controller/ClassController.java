package com.qf.controller;

import com.qf.entity.Class;
import com.qf.service.IClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 *
 *
 *
 */
@Controller
@RequestMapping("/class")
public class ClassController {

    @Autowired
    private IClassService classService;

    @RequestMapping("/list")
    @ResponseBody
    public List<Class> list(){
        List<Class> list = classService.getAllClass();
        return list;
    }

    //显示所有班级
    @RequestMapping("/show")
    public String show(ModelMap map){
        List<Class> classList = classService.getAllClass();
        map.put("classList", classList);
        return "class/class_list";
    }

    //跳转添加页面
    @RequestMapping("/toAdd")
    public String toAdd(){
        return "class/class_add";
    }

    //保存添加
    @RequestMapping("/add")
    public String add(Class c){
        int count = classService.insertSelective(c);
        if (count>0) {
            return "redirect:show";
        }
        return null;
    }

    //编辑回显
    @RequestMapping("/toUpdate")
    public String toUpdate(Long id, ModelMap map){
        Class c = classService.selectByPrimaryKey(id);
        map.put("c", c);
        return "class/class_update";
    }

    //保存修改
    @RequestMapping("/update")
    public String update(Class c){
        int count = classService.updateByPrimaryKeySelective(c);
        if (count>0) {
            return "redirect:show";
        }
        return null;
    }

    //删除
    @RequestMapping("/del")
    public String del(Long id){
        int count = classService.deleteByPrimaryKey(id);
        if (count>0) {
            return "redirect:show";
        }
        return null;
    }
}
