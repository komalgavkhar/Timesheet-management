package com.TimeSheet.EmployeeRepository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.TimeSheet.EmployeeModel.Employee;
@Repository
@EnableJpaRepositories
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    
	@Query("select emp_email from Employee ")
	List<Employee> findByemp_email(String emp_email);
     
	@Query("Select emp_username,emp_password from Employee")
	public Employee findByEmailAndPassword(String emp_username,String emp_password);

	

}
