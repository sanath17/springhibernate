package com.springhibernate.dao;

import java.util.List;

import com.springhibernate.model.Employee;

public interface EmployeeDAOIntrf {

	public void insertAnEmployee(Employee e);

	public void updateAnEmployee(Employee e);

	public List<Employee> listAllEmployees();

	public Employee getEmployeeId(int id);

	public void deleteEmployee(int id);

}
