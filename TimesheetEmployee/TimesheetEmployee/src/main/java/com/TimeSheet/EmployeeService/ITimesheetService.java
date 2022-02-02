package com.TimeSheet.EmployeeService;

import java.util.List;
import java.util.Optional;

import com.TimeSheet.EmployeeModel.Timesheet;

public interface ITimesheetService {
		
		public Timesheet addTimesheet(Timesheet timesheet);

		

		public Optional<Timesheet> findByTimesheetId(int timesheet);

		public List<Timesheet> findALLTimesheet();

		

		

		
	}

