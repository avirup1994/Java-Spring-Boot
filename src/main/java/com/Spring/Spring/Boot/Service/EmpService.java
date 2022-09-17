package com.Spring.Spring.Boot.Service;
import com.Spring.Spring.Boot.Model.Employee;
import java.util.List;;

public interface EmpService {
    public List<Employee> findAll();
    public void addEmployee();
}
