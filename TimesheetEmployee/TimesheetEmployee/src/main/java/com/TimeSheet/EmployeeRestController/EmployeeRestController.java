package com.TimeSheet.EmployeeRestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.TimeSheet.EmployeeModel.Employee;
import com.TimeSheet.EmployeeService.EmployeeService;
import com.TimeSheet.Exception.RecordNotFountException;




@RestController
@RequestMapping("/employee")
	public class EmployeeRestController {

		@Autowired
		EmployeeService service;
		//Default validation
		@PostMapping
		public ResponseEntity<Integer> createStudent(@Validated @RequestBody Employee employee){
			System.out.println("Rest");
			Employee e=service.addEmployee(employee);
			System.out.println(e);
			return new ResponseEntity<Integer>(e.getEmp_id(),HttpStatus.OK);
			
		}
		//fetch all employee details
		@GetMapping
		public ResponseEntity<List<Employee>> fetchStudent(){
			List<Employee> employee=service.findAllById();
			return ResponseEntity.ok().body(employee);
		}
		//fetch by id applied by custom validation
		@GetMapping("/{empid}")
		public ResponseEntity<Employee> getEmployeeById(@PathVariable int empid){
			Optional<Employee> employee=service.fetchById(empid);
			
			if(employee.isPresent()) {
				return new ResponseEntity<Employee>(employee.get(),HttpStatus.OK); 
			}else {
				
				throw new RecordNotFountException("Record NOt Found...");
			}
			}
		
		
		//update employee

		@PutMapping("/{empid}")
		public ResponseEntity<Employee> updateEmployee(@PathVariable int empid,@RequestBody Employee employeeD){
			Employee employee=service.fetchById(empid).orElseThrow(()-> new RecordNotFountException("Record not found"));
				
				employee.setEmp_department(employeeD.getEmp_department());
				employee.setEmp_designation_id(employeeD.getEmp_designation_id());
				employee.setEmp_email(employeeD.getEmp_email());
				//employee.setEmp_id(employeeD.getEmp_id());
				employee.setEmp_join_date(employeeD.getEmp_join_date());
				employee.setEmp_name(employeeD.getEmp_name());
				employee.setEmp_notes(employeeD.getEmp_notes());
				employee.setEmp_password(employeeD.getEmp_password());
				employee.setEmp_phones(employeeD.getEmp_phones());
				employee.setEmp_skills(employeeD.getEmp_skills());
				employee.setEmp_username(employeeD.getEmp_username());
				//return service.addEmployee(employee);
			Employee updatedEmployee=service.addEmployee(employee);
			return ResponseEntity.ok(updatedEmployee);
		}
		
		 //Delete Employee
		@DeleteMapping("/{empid}")
		public ResponseEntity<Map<String,Boolean>> deleteEmployee(@PathVariable int empid){
		Employee employee=service.fetchById(empid).orElseThrow(()->new RecordNotFountException("Employee not found"));
			service.delete(employee);
			Map<String, Boolean> response=new HashMap<>();	
			response.put("deleted", Boolean.TRUE);
			
			
			return ResponseEntity.ok(response);
		}
		
		@GetMapping("/login")
		public ResponseEntity createUser(@Validated @RequestBody Employee employee)
		{
		Employee us=service.authenticateCustomer(employee.getEmp_username(),employee.getEmp_password());
		
		if(Objects.nonNull(us))
		{
			System.out.println("hi");
			return ResponseEntity.ok().body("Login successfully");
		}
		else
		{
			return ResponseEntity.ok().body("Incorrect username or password");
			
		}
		
		}
		
		}
		  
		  

	


