package com.reportscheduler.api.repository;

import org.springframework.data.repository.CrudRepository;

import com.reportscheduler.api.models.Datasource;

public interface DatasourceRepository 
	extends CrudRepository<Datasource, Long>{

}
