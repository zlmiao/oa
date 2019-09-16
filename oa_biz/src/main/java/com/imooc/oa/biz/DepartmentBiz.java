package com.imooc.oa.biz;

import com.imooc.oa.entity.Department;

import java.util.List;

public interface DepartmentBiz {

    void add(Department department);
    void edit(Department department);
    void remove(String sn);
    Department get(String sn);    //获取指定部门信息
    List<Department> getAll();

}
