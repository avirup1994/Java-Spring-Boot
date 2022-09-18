package com.Spring.Spring.Boot.Service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.Spring.Spring.Boot.Model.Employee;
import com.Spring.Spring.Boot.Model.empRepo;
import java.util.*;

@Service
public class EmpServiceImpl implements EmpService{

    @Autowired
    private empRepo empRepo;
    private Logger logger=LogManager.getLogger(EmpServiceImpl.class);

    public List<Employee> findAll(){
        return empRepo.findAll();             
    }

    public Optional<Employee> findbyempId(int empId){
        return empRepo.findById(empId);
    }

    public void addEmployee(){
        List<Employee> allemp=new ArrayList<Employee>();
        allemp.add(new Employee(14,"Tuya","Medda","New Valley  ","Kolkata"));
        logger.info("Save Employee started");
        empRepo.saveAll(allemp);      
        logger.info("Save Employee completed");
    }
}
