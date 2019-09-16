package com.imooc.oa.dao;

import com.imooc.oa.entity.Department;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository("departmentDao")
public interface DepartmentDao {
    void insert(Department department);
    void update(Department department);
    void delete(String sn);
    Department select(String sn);      /*把记录查出来封装为Department对象*/
    List<Department> selectAll();      /*部门表里所有记录查到，封装到Department对象，最后存在List容器里*/

}
