package com.TimeSheet.EmployeeRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.TimeSheet.EmployeeModel.Timesheet;

public interface TimesheetRepository extends JpaRepository<Timesheet,Integer> {

	
	
}

