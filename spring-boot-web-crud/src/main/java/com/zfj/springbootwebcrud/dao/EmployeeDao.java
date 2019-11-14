package com.zfj.springbootwebcrud.dao;

import com.zfj.springbootwebcrud.pojo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.Map;

/**
 * @Author zfj
 * @create 2019/8/27 9:29
 */
@Repository
public class EmployeeDao {

    //Employee的pojo待完成-------
    private static Map<Integer, Employee> employees=null;


    @Autowired
    private DepartmentDao departmentDao;


    /*static{
        //定义数组,其中Depatment的pojo待完成---------
        employees=new HashMap<Integer,Employee>();
        //---------------------------------待插入数据-----------------------
        employees.put(1001,new Employee(1001,"E-AA","aa@163.com",1,new Depatment(101,"D-AA")));
        //---------------------------------待插入数据-----------------------

    }
    private static Integer initId=1006;

    public void save(Employee employee){
        if(employee.getId()==null){
            employee.setId(initId++);
        }
        employee.setDepartment(departmentDao.getDepartment(employee.getDepartment().getId()));
        employees.put(employee.getId(),employee);
    }*/


    //查询所有的员工
    public Collection<Employee> getAll(){return employees.values();}

    public Employee get(Integer id){return employees.get(id);}

    public void delete(Integer id){employees.remove(id);}
}
