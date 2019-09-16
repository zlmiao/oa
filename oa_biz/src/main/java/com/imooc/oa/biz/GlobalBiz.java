package com.imooc.oa.biz;

import com.imooc.oa.entity.Employee;


public interface GlobalBiz {

    Employee login(String sn,String password);
    void changePassword(Employee employee);         //还要给表现层使用方便，所以个参数

}
