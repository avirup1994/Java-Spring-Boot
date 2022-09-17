package com.Spring.Spring.Boot;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.Spring.Spring.Boot.Model.Employee;
import com.Spring.Spring.Boot.Service.EmpServiceImpl;
import java.util.List;

@RestController
@RequestMapping("/info")
public class controller {
	
	@Autowired
	private EmpServiceImpl service;
	private Logger logger=LogManager.getLogger(controller.class);
	private final static String route_MSG="Route url testing successful";
	

	@GetMapping("/test")
	public String testUrl() {
		return "Testing end point success";
	}
	
	@GetMapping("/route/{id}")
	public String routeUrl(@PathVariable int id) {
		logger.info("Fetching route paramter value {} ",id);
		return route_MSG;
	}
	
	@RequestMapping(value = "/getAll",produces = "Appliction/json")
	public ResponseEntity<List<Employee>> findAllEmp(){
		List<Employee> allEmployee=service.findAll();
		return new ResponseEntity<List<Employee>>(allEmployee, HttpStatus.OK);
	}

	@GetMapping("/testPost")
	public String testUrlPost() {
		service.addEmployee();
		return "Testing POST end point success";
	}
}