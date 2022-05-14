package com.Spring.Spring.Boot;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {
	
	private Logger logger=LogManager.getLogger(controller.class);
	private final static String home_MSG="Welcome to  home page Avirup";
	private final static String route_MSG="Route url testing successful";
	private final static String query_MSG="Query url testing successful";
	
	@GetMapping("/home")
	public String homeUrl() {
		return home_MSG;
	}
	
	@GetMapping("/route/{id}")
	public String routeUrl(@PathVariable int id) {
		logger.info("Fetching route paramter value {} ",id);
		return route_MSG;
	}
	
	@GetMapping("/query")
	public String queryUrl(@RequestParam String Name) {
		logger.info("Fetching query paramter input {} ",Name);
		return query_MSG;
	}
}
