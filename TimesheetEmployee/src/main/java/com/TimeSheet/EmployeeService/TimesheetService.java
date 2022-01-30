package com.TimeSheet.EmployeeService;

import java.util.List;
import java.util.Optional;

import com.TimeSheet.EmployeeModel.Timesheet;

public interface TimesheetService {
		
		public Timesheet addTimesheet(Timesheet timesheet);

		public List<Timesheet> finfdALLTimesheet();

		public Optional<Timesheet> findByTimesheetId(int timesheet);

		

		

		
	}

