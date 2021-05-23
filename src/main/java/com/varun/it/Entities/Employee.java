package com.varun.it.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "EMP_TABLE")
public class Employee {

	@Id
	@Column(name="EMP_ID")
	private Integer empId;
	
	@Column(name="EMP_NAME")
	private String empName;
	
	@Column(name="EMP_SAL")
	private double empSal;
	

	public Employee() {
		
	}

	public Employee(Integer empId, String empName, double empSal) {
		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
	}

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public double getEmpSal() {
		return empSal;
	}

	public void setEmpSal(double empSal) {
		this.empSal = empSal;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSal=" + empSal + "]";
	}
	
	
	
}
