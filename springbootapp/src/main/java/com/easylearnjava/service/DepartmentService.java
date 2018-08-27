package com.easylearnjava.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.easylearnjava.model.Department;
import com.easylearnjava.repository.DepartmentRepository;

@Service
public class DepartmentService {
	
	@Autowired
	DepartmentRepository repo;

	public List<Department> getAllDepartments(){
		return (List<Department>) repo.findAll();
	}
	
	public void addDepartment(Department department) {
		repo.save(department);
	}
	
	public void updateDepartment(Department department, int depId) {
		repo.save(department);
	}
	
	public void deleteDepartment(int id) {
		repo.delete(id);
	}
	
	public List<Department> getDepartmentsByCode(String code){
		return repo.findByDepCode(code);
	}
	
}
