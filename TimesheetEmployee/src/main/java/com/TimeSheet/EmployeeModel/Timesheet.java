package com.TimeSheet.EmployeeModel;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "Timesheet")
public class Timesheet {
    @Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private int timesheetid;
    @OneToOne
    @JsonIgnoreProperties("Timesheet")
	
	private Employee employee; 
    @OneToOne
    @JsonIgnoreProperties("Timesheet")
	
	private ProjectManager projectmanager;
    
	public Timesheet(int timesheetid, Employee employee, ProjectManager projectmanager, Date timesheetdate, int noofhrs,
			String approved, @Size(min = 2, message = "User name have atleast twocharacter") String approvedby,
			String rejecrsn) {
		super();
		this.timesheetid = timesheetid;
		this.employee = employee;
		this.projectmanager = projectmanager;
		Timesheetdate = timesheetdate;
		this.noofhrs = noofhrs;
		this.approved = approved;
		this.approvedby = approvedby;
		this.rejecrsn = rejecrsn;
	}
	public ProjectManager getProjectmanager() {
		return projectmanager;
	}
	public void setProjectmanager(ProjectManager projectmanager) {
		this.projectmanager = projectmanager;
	}
	private Date Timesheetdate;
	
	private int noofhrs;
	private String approved;
	
	@Column(name="approver_name",nullable=false)
	@Size(min=2,message="User name have atleast twocharacter")
	private String approvedby;
	
	private String rejecrsn;
	
	public int getTimesheetid() {
		return timesheetid;
	}
	public void setTimesheetid(int timesheetid) {
		this.timesheetid = timesheetid;
	}
	
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	public Date getTimesheetdate() {
		return Timesheetdate;
	}
	public void setTimesheetdate(Date timesheetdate) {
		Timesheetdate = timesheetdate;
	}
	public int getNoofhrs() {
		return noofhrs;
	}
	public void setNoofhrs(int noofhrs) {
		this.noofhrs = noofhrs;
	}
	public String getApproved() {
		return approved;
	}
	public void setApproved(String approved) {
		this.approved = approved;
	}
	public String getApprovedby() {
		return approvedby;
	}
	public void setApprovedby(String approvedby) {
		this.approvedby = approvedby;
	}
	public String getRejecrsn() {
		return rejecrsn;
	}
	public void setRejecrsn(String rejecrsn) {
		this.rejecrsn = rejecrsn;
	}
	@Override
	public String toString() {
		return "Timesheet [timesheetid=" + timesheetid  + ", Timesheetdate="
				+ Timesheetdate + ", noofhrs=" + noofhrs + ", approved=" + approved + ", approvedby=" + approvedby
				+ ", rejecrsn=" + rejecrsn + "]";
	}
}