package com.TimeSheet.EmployeeRepository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.TimeSheet.EmployeeModel.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	//List<Employee> findByemp_email(String emp_email);

	

}
