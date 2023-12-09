package com.hexaware.mapping.entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Department
{
	@Id
	private int departmentid;
	private String departmentname;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="dno")
	private Set<Employee> employees=new HashSet<Employee>();
	//always intialize collection type properties to avoid nullpoiterexception

	public int getDepartmentid() {
		return departmentid;
	}

	public void setDepartmentid(int departmentid) {
		this.departmentid = departmentid;
	}

	public String getDepartmentname() {
		return departmentname;
	}

	public void setDepartmentname(String departmentname) {
		this.departmentname = departmentname;
	}

	public Set<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(Set<Employee> employees) {
		this.employees = employees;
	}

	public Department(int departmentid, String departmentname, Set<Employee> employees) {
		super();
		this.departmentid = departmentid;
		this.departmentname = departmentname;
		this.employees = employees;
	}

	public Department() {
		super();
	}
	public void addEmployee(Employee employee)
	{
		employee.setDepartment(this);
		Set<Employee> set=getEmployees();
		set.add(employee);
	}
	
	

}
