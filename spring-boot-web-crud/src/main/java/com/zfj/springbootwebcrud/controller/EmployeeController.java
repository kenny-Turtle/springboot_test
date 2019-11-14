package com.zfj.springbootwebcrud.controller;

import com.zfj.springbootwebcrud.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Author zfj
 * @create 2019/8/27 9:26
 */
@Controller
public class EmployeeController {

    @Autowired
    private EmployeeDao employeeDao;

    //查询所有员工返回列表页面
    @GetMapping("/emps")
    public String list(Model model){

        /*Collection<Employee> employees = employeeDao.getAll();

        //放在请求域中，参数用model或者map或者ModelAndView
        model.addAttribute("emps",employees);*/

        return "/emp/list";
    }
}
