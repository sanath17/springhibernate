package com.springhibernate.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.springhibernate.model.Employee;

public class EmployeeDAOImpl implements EmployeeDAOIntrf {

	private static final Logger logger = LoggerFactory.getLogger(EmployeeDAOImpl.class);

	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sf) {
		this.sessionFactory = sf;
	}

	// To-Do
	// Need to discuss about loggers

	@Override
	public void insertAnEmployee(Employee e) {
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(e);
		logger.info("Employee saved successfully, Person Details="+e);
	}

	@Override
	public void updateAnEmployee(Employee e) {
		Session session = this.sessionFactory.getCurrentSession();
		session.update(e);
		logger.info("Employee updated successfully, Person Details="+e);
	}

	@Override
	public List<Employee> listAllEmployees() {
		return null;
	}

	@Override
	public Employee getEmployeeId(int id) {
		return null;
	}

	@Override
	public void deleteEmployee(int id) {

	}

}
