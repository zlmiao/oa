package com.imooc.oa.controller;

import com.imooc.oa.biz.GlobalBiz;
import com.imooc.oa.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

@Controller("globalController")           //给spring，    没有路径，直接访问二级路径
public class GlobalController {
    @Autowired
    private GlobalBiz globalBiz;


    @RequestMapping("/to_login")
    public String toLogin(){
        return "login";       //跳转到login.jsp
    }

    @RequestMapping("/login")
    public String login(HttpSession session, @RequestParam String sn, @RequestParam String password){
        Employee employee = globalBiz.login(sn,password);
        if (employee == null) {
            return "redirect:to_login";
        }
        session.setAttribute("employee",employee);
        return "redirect:self";
    }

    @RequestMapping("/self")
    public String self(){                 //self个人信息
        return  "self";
    }

    @RequestMapping("/quit")
    public String quit(HttpSession session){                 //退出和个人信息只在controller层里操作就可以了，直接对session操作
        session.setAttribute("employee",null);
        return "redirect:to_login";
    }

    //修改密码
    @RequestMapping("/to_change_password")
    public String toChangePassword(){
        return "change_password";
    }

    @RequestMapping("/change_password")
    public String changePassword(HttpSession session, @RequestParam String old, @RequestParam String new1 ,@RequestParam String new2){
        Employee employee = (Employee)session.getAttribute("employee");      //session里获取employee
        if(employee.getPassword().equals(old)){
            if(new1.equals(new2)){
                employee.setPassword(new1);
                globalBiz.changePassword(employee);
                return "redirect:self";
            }
        }
        return "redirect:to_change_password";          //两次情况都不匹配，再无从星修改密码
    }

}
