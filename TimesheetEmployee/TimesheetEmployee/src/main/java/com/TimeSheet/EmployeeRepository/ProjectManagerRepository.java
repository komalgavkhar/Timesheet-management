package com.TimeSheet.EmployeeRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.TimeSheet.EmployeeModel.ProjectManager;

public interface ProjectManagerRepository extends JpaRepository<ProjectManager,Integer> {

	/*
	 * @Query("select proj_name ProjectManager ") List<ProjectManager>
	 * findByproj_name(String pnm);
	 */

	

}
