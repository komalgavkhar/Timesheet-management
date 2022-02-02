package com.TimeSheet.EmployeeRestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import javax.validation.Valid;

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

import com.TimeSheet.EmployeeModel.Timesheet;
import com.TimeSheet.EmployeeService.TimesheetService;
import com.TimeSheet.Exception.RecordNotFountException;

@RestController
@RequestMapping("/timesheet")
public class TimesheetRestController {
	    @Autowired
		TimesheetService service;
		
		@PostMapping
		public ResponseEntity<Integer> createStudent(@Validated @RequestBody Timesheet timesheet) {
			System.out.println("Rest");
			Timesheet t = service.addTimesheet(timesheet);
			System.out.println(t);
			return new ResponseEntity<Integer>(t.getTimesheetid(),HttpStatus.OK);
		}
		
		@GetMapping
		public ResponseEntity<List<Timesheet>> fetchStudents() {
			
			List<Timesheet> timesheet = service.findALLTimesheet();
			return  ResponseEntity.ok().body(timesheet);
			
		}
		
		@GetMapping("/{timesheetid}")
		public ResponseEntity<Timesheet> getTimesheetById(@PathVariable int timesheetid) {
			Optional<Timesheet> timesheet = service.findByTimesheetId(timesheetid);
			if(timesheet.isPresent()) {
				return new ResponseEntity<>(timesheet.get(), HttpStatus.OK);
			}
			else {
				throw new RecordNotFountException("Record Not Found..");
			}
		}
		@PutMapping("/{timesheetid}")
		public ResponseEntity<Timesheet> updateProject(@PathVariable int timesheetid,@Valid @RequestBody Timesheet projectD) {
        Timesheet project=service.findByTimesheetId(timesheetid) .orElseThrow(()->new RecordNotFountException("Record not Found"));
       project.setApproved(projectD.getApproved());
       project.setApprovedby(projectD.getApprovedby());
       project.setEmployee(projectD.getEmployee());
       project.setNoofhrs(projectD.getNoofhrs());
       project.setProjectmanager(projectD.getProjectmanager());
       project.setRejecrsn(projectD.getRejecrsn());
       project.setTimesheetdate(projectD.getTimesheetdate());
       project.setTimesheetid(projectD.getTimesheetid());
     
         Timesheet updateProject = service.addTimesheet(project);
        return ResponseEntity.ok(updateProject);
		
		}
		
		@DeleteMapping("/{timesheetid}")
		public ResponseEntity<Map<String,Boolean>> deleteProject(@PathVariable int timesheetid){
			Timesheet project=service.findByTimesheetId(timesheetid).orElseThrow(()->new RecordNotFountException("Project not Found"));
			service.delete(project);
			Map<String,Boolean> response=new HashMap<String, Boolean>();
			response.put("deleted", Boolean.TRUE);
			return ResponseEntity.ok(response);
			
			
			
		}
		
		
	}

