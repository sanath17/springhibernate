package com.springhibernate.service;

import java.util.List;

import javax.transaction.Transactional;

import com.springhibernate.dao.EmployeeDAOIntrf;
import com.springhibernate.model.Employee;



public class EmployeeServiceImpl implements EmployeeServiceIntrf{

	private EmployeeDAOIntrf employeeDAOIntrf;
	
	public void setEmployeeDao(EmployeeDAOIntrf employeeDAOIntrf) {
		this.employeeDAOIntrf = employeeDAOIntrf;
	}
	
	
	@Transactional
	@Override
	public void insertAnEmployee(Employee e) {
		this.employeeDAOIntrf.insertAnEmployee(e);
		
		
	}

	@Override
	public void updateAnEmployee(Employee e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Employee> listAllEmployees() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee getEmployeeId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteEmployee(int id) {
		// TODO Auto-generated method stub
		
	}
//	
//	
//
//	@Override
//	public void insertAnEmployee(Employee e) {
//		this.employeeDAO.insertAnEmployee(e);
//		
//	}
//
//	@Override
//	public void updateAnEmployee(Employee e) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public List<Employee> listAllEmployees() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public Employee getEmployeeId(int id) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public void deleteEmployee(int id) {
//		// TODO Auto-generated method stub
//		
//	}
//	
	

}
