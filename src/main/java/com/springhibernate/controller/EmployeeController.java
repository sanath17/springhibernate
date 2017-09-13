package com.springhibernate.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.springhibernate.model.Employee;
import com.springhibernate.service.EmployeeServiceIntrf;

public class EmployeeController {
	
	private EmployeeServiceIntrf employeeServiceInrf;
	
	@Autowired(required=true)
	@Qualifier(value="employeeServiceInrf")
	public void setEmployeeService(EmployeeServiceIntrf ps){
		this.employeeServiceInrf = ps;
	}
	
	@RequestMapping(value= "/employee/add", method = RequestMethod.POST)
	public String addPerson(@ModelAttribute("employee") Employee e){
		
		if(e.getId() == 0){
			//new person, add it
			this.employeeServiceInrf.insertAnEmployee(e);
		}else{
			//existing person, call update
			this.employeeServiceInrf.updateAnEmployee(e);
		}		
		return "redirect:/employee";
	}

}
