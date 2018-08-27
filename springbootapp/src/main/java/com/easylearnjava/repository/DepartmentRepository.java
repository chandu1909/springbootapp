package com.easylearnjava.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.easylearnjava.model.Department;

public interface DepartmentRepository extends CrudRepository<Department, Integer>{
	
	public List<Department> findByDepCode(String code);

}
