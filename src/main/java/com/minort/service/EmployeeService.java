package com.minort.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.minort.model.Employee;
import com.minort.repo.EmployeeRepo;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepo employeeRepo;
	public List<Employee> getEmployees(){
	return employeeRepo.findAll();

}
	public Employee saveEmployee(Employee employee) {
		return employeeRepo.save(employee);
	}
	
}