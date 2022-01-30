package com.TimeSheet.EmployeeService;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.TimeSheet.EmployeeModel.ProjectManager;
import com.TimeSheet.EmployeeModel.Timesheet;
import com.TimeSheet.EmployeeRepository.TimesheetRepository;

@Service
public class TimesheetServiceimpl implements TimesheetService{

	@Autowired
	TimesheetRepository dao;
	public Timesheet addTimesheet(Timesheet timesheet) 
	{
		Timesheet time = dao.save(timesheet);
		
		return time;
	}
	@Override
	public List<Timesheet> finfdALLTimesheet() {
		// TODO Auto-generated method stub
		List<Timesheet> timesheet = dao.findAll();
		return timesheet;
	}
	@Override
	public Optional<Timesheet> findByTimesheetId(int timesheetid) {
		// TODO Auto-generated method stub
		return dao.findById(timesheetid);
	}
	
	
	
	public void delete(Timesheet project) {
		// TODO Auto-generated method stub
		dao.delete(project);
	}
	
	

		
		
}
