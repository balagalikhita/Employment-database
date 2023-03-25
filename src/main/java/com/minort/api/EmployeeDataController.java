package com.minort.api;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.minort.model.Employee;
import com.minort.service.EmployeeService;

@RestController
public class EmployeeDataController {
	@Autowired
	private EmployeeService employeeService;

	@GetMapping("/employees")
	public List<Employee> getEmployees(){
		return employeeService.getEmployees();

}
	@PostMapping("/employees")
	public Employee saveEmployee(@RequestBody Employee employee){
		return employeeService.saveEmployee(employee);
		
			

}
}