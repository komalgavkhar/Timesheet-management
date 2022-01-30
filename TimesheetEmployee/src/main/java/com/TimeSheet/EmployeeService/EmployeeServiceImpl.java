package com.TimeSheet.EmployeeService;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.TimeSheet.EmployeeModel.Employee;
import com.TimeSheet.EmployeeRepository.EmployeeRepository;





@Service
public  class EmployeeServiceImpl implements EmployeeS {
	@Autowired
	EmployeeRepository emprepo;

	public Employee addEmployee(Employee employee) {
		
		Employee emp = emprepo.save(employee);
	
		return emp;
	}

	@Override
	public Optional<Employee> fetchById(int id) {
		return emprepo.findById(id);

		
	}

	public List<Employee> findAllById() {
		// TODO Auto-generated method stub
		return emprepo.findAll();


	}
	/*
	 * public List<Employee> findByemp_email(String emp_email){ List<Employee>
	 * employee=emprepo.findByemp_email(emp_email); return employee;
	 * 
	 * }
	 */

	public void delete(Employee employee) {
		// TODO Auto-generated method stub
		emprepo.delete(employee);
		
	}

	

	


}
