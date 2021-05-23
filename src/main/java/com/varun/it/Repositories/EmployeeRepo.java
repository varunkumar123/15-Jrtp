package com.varun.it.Repositories;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.varun.it.Entities.Employee;



public interface EmployeeRepo extends CrudRepository<Employee, Serializable> {

	// public Employee findByEmpName(String name);
	
	  public Employee findByempId(Integer num);
	
	 public List<Employee> findByEmpSal(Double sal);

}
