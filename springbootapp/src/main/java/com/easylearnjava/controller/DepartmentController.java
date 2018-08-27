package com.easylearnjava.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.easylearnjava.model.Department;
import com.easylearnjava.service.DepartmentService;

@RestController
public class DepartmentController {
	
	@Autowired
	DepartmentService service;
	
	@RequestMapping(value="/departments",  method=RequestMethod.GET)
	public List<Department> getAllDepartments(){
		return service.getAllDepartments();
	}
	
	@RequestMapping(value="/departments", method=RequestMethod.POST)
	public void addDepartment(@RequestBody Department depObj) {
		service.addDepartment(depObj);
	}
	
	@RequestMapping(value="/departments/{id}", method=RequestMethod.PUT)
	public void updateDepartment(@RequestBody Department depObj, @PathVariable int id) {
		service.updateDepartment(depObj, id);
	}
	
	@RequestMapping(value="/departments/{id}", method=RequestMethod.DELETE)
	public void deleteDepartment(@PathVariable int id) {
		service.deleteDepartment(id);
	}
	
	@RequestMapping(value="/departmentsByCode/{code}", method=RequestMethod.GET)
	public List<Department> getDepartmentsByCode(@PathVariable String code) {
		return service.getDepartmentsByCode(code);
	}

}
