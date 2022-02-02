package com.TimeSheet.demo;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.TimeSheet.EmployeeModel.Employee;
import com.TimeSheet.EmployeeRepository.EmployeeRepository;
import com.TimeSheet.EmployeeService.EmployeeService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Employeetest {

		
		@Autowired
		private EmployeeService service;
		
		@MockBean
		private EmployeeRepository repository;
		
		//fetchAllEmployee 

		@Test
		 public void getEmployeeAddTest() {
			when(repository.findAll()).thenReturn(
					Stream.of (new Employee(15, "kirtee raj", "emp222","tester", "testing", "notes", "emp103@org.com", "34567767", "empkeshavraj","emp222") ,
							new Employee(16, "karan raje", "emp2212","coder", "coding", "notes", "emp1023@org.com", "34567767672", "empkeshavraj2","emp2223")).collect(Collectors.toList()));        
			assertEquals(2,service.findAllById().size());
		}
		
		//fetchEmployeeById
		
		
		 @Test public void getEmployeeById() { String emp="emp103@org.com";
		 when(repository.findByemp_email(emp)) .thenReturn(Stream.of(new Employee(15,
		 "kirtee raj", "emp222","tester", "testing", "notes", "emp103@org.com",
		 "34567767", "empkeshavraj","emp222")).collect(Collectors.toList()));
	
		 assertEquals(1,service.findByemp_email(emp).size()); }
		 
		
		@Test
		public void saveUser() {
			Employee employee=new Employee(37, "kirtee raj", "emp222","tester", "testing", "notes", "emp103@org.com", "34567767", "empkeshavraj","emp222");
			when(repository.save(employee)).thenReturn(employee);
			assertEquals(employee,service.addEmployee(employee));
		}

	}
