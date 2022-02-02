package com.TimeSheet.EmployeeService;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.TimeSheet.EmployeeModel.Employee;
import com.TimeSheet.Exception.UserException;


@Service
public interface IEmployeeService {
	public Employee addEmployee(Employee employee);
	public Optional<Employee> fetchById(int id);
	Employee authenticateCustomer(String username, String password) throws UserException;
	

}
