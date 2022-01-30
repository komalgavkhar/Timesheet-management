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

import com.TimeSheet.EmployeeModel.ProjectManager;
import com.TimeSheet.EmployeeService.ProjectManagerSImpl;
import com.TimeSheet.Exception.RecordNotFountException;

@RestController
@RequestMapping("/projectManager")
public class ProjectManagerRestController {


			@Autowired 
			 ProjectManagerSImpl service;
			
			@PostMapping
			public ResponseEntity<Integer> createProject(@Validated @RequestBody ProjectManager projectManager)
			{
				System.out.println("Rest");
				ProjectManager p = service.addProject(projectManager);
				System.out.println(p);
				return new ResponseEntity<Integer>(p.getProj_id(), HttpStatus.OK);
				
			
				
			}
			
			@GetMapping
			public ResponseEntity<List<ProjectManager>> fetchProject() {
				List<ProjectManager> project =service.findAllProject();
				return ResponseEntity.ok().body(project);
			}
			
			@GetMapping("/{proj_id}")
			public ResponseEntity<ProjectManager> getProjectById(@PathVariable int proj_id) {
				Optional<ProjectManager> project = service.findByProjectId(proj_id);
				
				if (project.isPresent()) {
					return new ResponseEntity<>(project.get(),HttpStatus.OK);
				} else {
					throw new RecordNotFountException("Record Not Found...");
				}
				
			}
			
			@PutMapping("/{proj_id}")
			public ResponseEntity<ProjectManager> updateProject(@PathVariable int proj_id,@Valid @RequestBody ProjectManager projectManager) {
	        ProjectManager project=service.findByProjectId(proj_id) .orElseThrow(()->new RecordNotFountException("Record not Found"));
	        project.setProj_name(projectManager.getProj_name());
	        project.setProj_client_name(projectManager.getProj_client_name());
	        project.setProj_client_brief(projectManager.getProj_client_brief());
	        project.setProj_client_manager(projectManager.getProj_client_manager());
	        project.setProj_client_emailid(projectManager.getProj_client_emailid());
	        project.setProj_os_id(projectManager.getProj_os_id());
	        project.setProj_db_id(projectManager.getProj_db_id());
	        project.setProj_app_server_id(projectManager.getProj_app_server_id());
	        project.setProj_pm_name(projectManager.getProj_pm_name());
	        project.setProj_pl(projectManager.getProj_pl());
	        project.setProj_notes(projectManager.getProj_notes());
	        project.setProj_start_date(projectManager.getProj_start_date());
	        project.setProj_end_date(projectManager.getProj_end_date());
	        project.setStatus(projectManager.getStatus());
	        //project.setTimesheet(project);
	      //  project.setProj_id(projectManager.getProj_id());
	       
	        ProjectManager updateProject=service.addProject(project);
	        return ResponseEntity.ok(updateProject);
			
			}
			
			@DeleteMapping("/{proj_id}")
			public ResponseEntity<Map<String,Boolean>> deleteProject(@PathVariable int proj_id){
				ProjectManager project=service.findByProjectId(proj_id).orElseThrow(()->new RecordNotFountException("Project not Found"));
				service.delete(project);
				Map<String,Boolean> response=new HashMap<String, Boolean>();
				response.put("deleted", Boolean.TRUE);
				return ResponseEntity.ok(response);
				
				
				
			}
			
			
			
			
	}
