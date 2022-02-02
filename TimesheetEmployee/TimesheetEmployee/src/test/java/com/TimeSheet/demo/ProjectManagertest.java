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

import com.TimeSheet.EmployeeModel.ProjectManager;
import
  com.TimeSheet.EmployeeRepository.ProjectManagerRepository;
import
  com.TimeSheet.EmployeeService.ProjectManagerService;
  
  @RunWith(SpringRunner.class)
  
  @SpringBootTest public class ProjectManagertest {
  
  
  
  @Autowired private ProjectManagerService service;
  
  @MockBean
  
  @Autowired private ProjectManagerRepository repository;
  
  //fetchAllEmployee
  
  @Test public void getProjectAddTest() {
  when(repository.findAll()).thenReturn( Stream.of (new ProjectManager(29,
  "camel","kkge", "brefg", "bgfr", "bhkg", "khkt", "mnhk", "nkhm", "khmn",
  "klpl", "klpi", "wing"), new ProjectManager(29, "camel","kkge", "brefg",
  "bgfr", "bhkg", "khkt", "mnhk", "nkhm", "khmn", "klpl", "klpi",
  "wing")).collect(Collectors.toList()));
  assertEquals(2,service.findAllProject().size()); }
 
  //fetchEmployeeById
  
  
  
	/*
	 * @Test public void getEmployeeById() { String pnm="camel";
	 * when(repository.findByproj_name(pnm)) .thenReturn(Stream.of(new
	 * ProjectManager(29, "camel","kkge", "brefg", "bgfr", "bhkg", "khkt", "mnhk",
	 * "nkhm", "khmn", "klpl", "klpi", "wing")).collect(Collectors.toList()));
	 * 
	 * assertEquals(1,service.findByproj_name(pnm).size()); }
	 */
 
  @Test public void saveUser() { ProjectManager pm=new ProjectManager(29,
  "camel","kkge", "brefg", "bgfr", "bhkg", "khkt", "mnhk", "nkhm", "khmn",
  "klpl", "klpi", "wing"); when(repository.save(pm)).thenReturn(pm);
  assertEquals(pm,service.addProject(pm)); }
  
  
  }
  
 