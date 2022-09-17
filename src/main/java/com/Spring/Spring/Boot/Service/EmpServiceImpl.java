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
        List<Employee> allempdetails=empRepo.findAll();
        allempdetails.forEach(n->System.out.println(n.toString()));
        //logger.info("Fetching all employee details {} ",allempdetails);
        return allempdetails;
    }

    public void addEmployee(){
        List<Employee> allemp=new ArrayList<Employee>();
        allemp.add(new Employee(12,"Avirup","De","Whitefield","Bangalore"));
        logger.info("Save Employee started witd details {} ",allemp);
        empRepo.saveAll(allemp);      
        logger.info("Save Employee Completed with details {} ",allemp);
    }
}
