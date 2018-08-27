package com.easylearnjava.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Department {

	@Id
	private Integer id;
	
	@Column(name="department_code")
	private String depCode;
	
	@Column
	private String depName;

	public Department() {

	}

	public Department(Integer id, String depCode, String depName) {
		super();
		this.id = id;
		this.depCode = depCode;
		this.depName = depName;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDepCode() {
		return depCode;
	}

	public void setDepCode(String depCode) {
		this.depCode = depCode;
	}

	public String getDepName() {
		return depName;
	}

	public void setDepName(String depName) {
		this.depName = depName;
	}

}
