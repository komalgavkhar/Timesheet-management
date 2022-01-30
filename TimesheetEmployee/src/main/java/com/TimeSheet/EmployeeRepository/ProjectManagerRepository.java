package com.TimeSheet.EmployeeRepository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.TimeSheet.EmployeeModel.ProjectManager;

public interface ProjectManagerRepository extends JpaRepository<ProjectManager,Integer> {

	

}
