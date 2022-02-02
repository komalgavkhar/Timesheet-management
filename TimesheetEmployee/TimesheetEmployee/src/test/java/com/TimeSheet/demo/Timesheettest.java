package com.TimeSheet.demo;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import
org.springframework.boot.test.mock.mockito.MockBean;
import
org.springframework.test.context.junit4.SpringRunner;

import com.TimeSheet.EmployeeModel.Timesheet;
import com.TimeSheet.EmployeeRepository.TimesheetRepository;
import com.TimeSheet.EmployeeService.TimesheetService;

@RunWith(SpringRunner.class)

@SpringBootTest
public class Timesheettest {
	
	  
	  
	  @Autowired private TimesheetService service;
	  
	  @MockBean
	  
	  @Autowired private TimesheetRepository repository;
	  
	  //fetchAllEmployee
	  
	  @Test public void getProjectAddTest() {
	  when(repository.findAll()).thenReturn( Stream.of (new Timesheet(1,8,"approved","kk","rjcrn")).collect(Collectors.toList()));
	 
	  assertEquals(1,service.findALLTimesheet().size()); }
	 
	  //fetchEmployeeById
	  
	  
	  
		/*
		 * @Test public void getEmployeeById() { String pnm="camel";
		 * when(repository.findByproj_name(pnm)) .thenReturn(Stream.of(new
		 * ProjectManager(29, "camel","kkge", "brefg", "bgfr", "bhkg", "khkt", "mnhk",
		 * "nkhm", "khmn", "klpl", "klpi", "wing")).collect(Collectors.toList()));
		 * 
		 * assertEquals(1,service.findByproj_name(pnm).size()); }
		 */
	 
	  @Test public void saveUser() { Timesheet timesheet=new Timesheet(1,8,"approved","kk","rjcrn");when(repository.save(timesheet)).thenReturn(timesheet);
	  assertEquals(timesheet,service.addTimesheet(timesheet)); }
	  
	  
	  }

	 

