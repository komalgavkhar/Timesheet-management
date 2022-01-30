package com.TimeSheet.EmployeeService;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.TimeSheet.EmployeeModel.Employee;



public interface EmployeeS {
	public Employee addEmployee(Employee employee);
	public Optional<Employee> fetchById(int id);
	

}
