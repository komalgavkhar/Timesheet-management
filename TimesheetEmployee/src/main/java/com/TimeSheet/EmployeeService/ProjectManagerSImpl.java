package com.TimeSheet.EmployeeService;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.TimeSheet.EmployeeModel.ProjectManager;
import com.TimeSheet.EmployeeRepository.ProjectManagerRepository;

@Service
public class ProjectManagerSImpl implements ProjectManagerS {
	
	

		@Autowired
		ProjectManagerRepository repo;
		@Override
		public ProjectManager addProject(ProjectManager projectManager) {
			// TODO Auto-generated method stub
			ProjectManager pm = repo.save(projectManager);
			
			return pm;
		}
	
			
		
	

		public List<ProjectManager> findAllProject() {
			// TODO Auto-generated method stub
			return repo.findAll();
		}
		@Override
		public Optional<ProjectManager> findByProjectId(int proj_id) {
			// TODO Auto-generated method stub
			return repo.findById(proj_id);
		}

		public void delete(ProjectManager project) {
			// TODO Auto-generated method stub
			repo.delete(project);
			
		}

		


	
}
