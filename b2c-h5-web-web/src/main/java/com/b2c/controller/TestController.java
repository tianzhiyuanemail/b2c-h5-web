package com.b2c.controller;
import com.b2c.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import com.b2c.tests.Student;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Administrator on 2017/7/25 0025.
 */
@Controller
@RequestMapping
public class TestController {
    @Autowired
    private IStudentService studentService;

    @RequestMapping("/aaa")
    @ResponseBody
    public Student aaa(String name, ModelMap modelMap){

       // com.b2c.tests.Student student = studentService.selectByName(name);
        Student student = studentService.selectByName(name);
        return student;
    }

}
