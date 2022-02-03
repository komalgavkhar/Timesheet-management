package com.TimeSheet.EmployeeModel;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
@Table(name = "project")
public class ProjectManager {

@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private int proj_id;

@NotEmpty

@Size(max=20,message="project name have atleast twocharacter upto 20 character")
private String proj_name;

@NotEmpty

@Size(max=20,message="proj_client_name have atleast twocharacter upto 20 character")
private String proj_client_name;

@NotEmpty

@Size(max=20,message="Proj_client_brief have atleast twocharacter upto 20 character")
private String proj_client_brief;

@NotEmpty

@Size(max=20,message="proj_Client_manager have atleast twocharacter upto 20 character")
private String proj_client_manager;

@NotEmpty

@Size(max=20,message="Proj_client_emailid have atleast twocharacter upto 20 character")
private String proj_client_emailid;

@NotEmpty

@Size(max=20,message="Proj_os_id have atleast twocharacter upto 20 character")
private String proj_os_id;

@NotEmpty

@Size(max=20,message="Proj_db_id have atleast twocharacter upto 20 character")
private String proj_db_id;
@NotEmpty

@Size(max=20,message="Proj_app_server_id have atleast twocharacter upto 20 character")

private String proj_app_server_id;
@NotEmpty

@Size(max=20,message="Proj_pm_name have atleast twocharacter upto 20 character")

private String proj_pm_name;
@NotEmpty

@Size(max=20,message="Proj_pl have atleast twocharacter upto 20 character")

private String proj_pl;
@NotEmpty

@Size(max=20,message="Proj_notes have atleast twocharacter upto 20 character")

private String proj_notes;
@NotEmpty

@Size(max=20,message="Proj_start_date have atleast twocharacter upto 20 character")

private Date proj_start_date;
@NotEmpty

@Size(max=20,message="Proj_end_date have atleast twocharacter upto 20 character")

private Date proj_end_date;
@NotEmpty

@Size(max=20,message="status have atleast twocharacter upto 20 character")

private String status;
/*
 * @OneToOne
 * 
 * @JsonIgnoreProperties("ProjectManager")
 * 
 * private Timesheet timesheet;
 * 
 * 
 * 
 * 
 * public Timesheet getTimesheet() { return timesheet; } public void
 * setTimesheet(Timesheet timesheet) { this.timesheet = timesheet; }
 */




public ProjectManager() {
}


public int getProj_id() {
	return proj_id;
}


public void setProj_id(int p_id) {
	this.proj_id = p_id;
}


public String getProj_name() {
	return proj_name;
}


public void setProj_name(String p_name) {
	this.proj_name = p_name;
}


public String getProj_client_name() {
	return proj_client_name;
}


public void setProj_client_name(String p_client_name) {
	this.proj_client_name = p_client_name;
}


public String getProj_client_brief() {
	return proj_client_brief;
}


public void setProj_client_brief(String p_client_brief) {
	this.proj_client_brief = p_client_brief;
}


public String getProj_client_manager() {
	return proj_client_manager;
}


public void setProj_client_manager(String p_client_manager) {
	this.proj_client_manager = p_client_manager;
}


public String getProj_client_emailid() {
	return proj_client_emailid;
}


public void setProj_client_emailid(String p_client_emailid) {
	this.proj_client_emailid = p_client_emailid;
}


public String getProj_os_id() {
	return proj_os_id;
}


public void setProj_os_id(String p_os_id) {
	this.proj_os_id = p_os_id;
}


public String getProj_db_id() {
	return proj_db_id;
}


public void setProj_db_id(String p_db_id) {
	this.proj_db_id = p_db_id;
}


public String getProj_app_server_id() {
	return proj_app_server_id;
}


public void setProj_app_server_id(String p_app_server_id) {
	this.proj_app_server_id = p_app_server_id;
}


public String getProj_pm_name() {
	return proj_pm_name;
}


public void setProj_pm_name(String p_pm_name) {
	this.proj_pm_name = p_pm_name;
}


public String getProj_pl() {
	return proj_pl;
}


public void setProj_pl(String p_pl) {
	this.proj_pl = p_pl;
}


public String getProj_notes() {
	return proj_notes;
}


public void setProj_notes(String p_notes) {
	this.proj_notes = p_notes;
}


public Date getProj_start_date() {
	return proj_start_date;
}


public void setProj_start_date(Date p_start_date) {
	this.proj_start_date = p_start_date;
}


public Date getProj_end_date() {
	return proj_end_date;
}


public void setProj_end_date(Date p_end_date) {
	this.proj_end_date = p_end_date;
}


public String getStatus() {
	return status;
}


public void setStatus(String status) {
	this.status = status;
}


@Override
public String toString() {
	return "ProjectManager [proj_id=" + proj_id + ", proj_name=" + proj_name + ", proj_client_name=" + proj_client_name
			+ ", proj_client_brief=" + proj_client_brief + ", proj_client_manager=" + proj_client_manager
			+ ", proj_client_emailid=" + proj_client_emailid + ", proj_os_id=" + proj_os_id + ", proj_db_id="
			+ proj_db_id + ", proj_app_server_id=" + proj_app_server_id + ", proj_pm_name=" + proj_pm_name
			+ ", proj_pl=" + proj_pl + ", proj_notes=" + proj_notes + ", proj_start_date=" + proj_start_date
			+ ", proj_end_date=" + proj_end_date + ", status=" + status + "]";
}


public ProjectManager(int proj_id,
		@NotEmpty @Size(max = 20, message = "project name have atleast twocharacter upto 20 character") String proj_name,
		@NotEmpty @Size(max = 20, message = "p_client name have atleast twocharacter upto 20 character") String proj_client_name,
		@NotEmpty @Size(max = 20, message = "P_client_brief have atleast twocharacter upto 20 character") String proj_client_brief,
		@NotEmpty @Size(max = 20, message = "p_Client_manager have atleast twocharacter upto 20 character") String proj_client_manager,
		@NotEmpty @Size(max = 20, message = "Pe_client_emailid have atleast twocharacter upto 20 character") String proj_client_emailid,
		@NotEmpty @Size(max = 20, message = "P_os_id have atleast twocharacter upto 20 character") String proj_os_id,
		@NotEmpty @Size(max = 20, message = "P_db_id have atleast twocharacter upto 20 character") String proj_db_id,
		@NotEmpty @Size(max = 20, message = "P_db_id have atleast twocharacter upto 20 character") String proj_notes,
		@NotEmpty @Size(max = 20, message = "P_app_server_id have atleast twocharacter upto 20 character") String proj_app_server_id,
		@NotEmpty @Size(max = 20, message = "Proj_pm_name have atleast twocharacter upto 20 character") String proj_pm_name,
		@NotEmpty @Size(max = 20, message = "Proj_pl have atleast twocharacter upto 20 character") String proj_pl,
		@NotEmpty @Size(max = 20, message = "Proj_notes have atleast twocharacter upto 20 character") String proj_notes,
		@NotEmpty @Size(max = 20, message = "status have atleast twocharacter upto 20 character") String status) {
	this.proj_id = proj_id;
	this.proj_name = proj_name;
	this.proj_client_name = proj_client_name;
	this.proj_client_brief = proj_client_brief;
	this.proj_client_manager = proj_client_manager;
	this.proj_client_emailid = proj_client_emailid;
	this.proj_os_id = proj_os_id;
	this.proj_db_id = proj_db_id;
	this.proj_app_server_id = proj_app_server_id;
	this.proj_pm_name = proj_pm_name;
	this.proj_pl = proj_pl;
	this.proj_notes = proj_notes;
	this.status = status;
}










}