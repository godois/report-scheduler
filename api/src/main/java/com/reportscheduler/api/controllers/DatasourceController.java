package com.reportscheduler.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.reportscheduler.api.models.Datasource;
import com.reportscheduler.api.repository.DatasourceRepository;

@RestController
public class DatasourceController {

	@Autowired
	private DatasourceRepository datasourceRepository;

	@RequestMapping("/datasource")
	public @ResponseBody String addNewUser(
				@RequestParam String name, 
				@RequestParam String connectionString,
				@RequestParam String driver) {
		
		Datasource ds = new Datasource();
		ds.setName(name);
		ds.setConnectionString(connectionString);
		ds.setDriver(driver);
		datasourceRepository.save(ds);
		
		return "saved";
	}
	
}
