package com.TimeSheet.EmployeeModel;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "project")
public class ProjectManager {



@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private int proj_id;

private String proj_name;
private String proj_client_name;
private String proj_client_brief;
private String proj_client_manager;
private String proj_client_emailid;
private String proj_os_id;
private String proj_db_id;
public ProjectManager(int proj_id, String proj_name, String proj_client_name, String proj_client_brief,
		String proj_client_manager, String proj_client_emailid, String proj_os_id, String proj_db_id,
		String proj_app_server_id, String proj_pm_name, String proj_pl, String proj_notes 
		, String status) {
	super();
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
	this.proj_start_date = proj_start_date;
	this.proj_end_date = proj_end_date;
	this.status = status;
	//this.timesheet = timesheet;
}


private String proj_app_server_id;
private String proj_pm_name;
private String proj_pl;
private String proj_notes;
private Date proj_start_date;
private Date proj_end_date;
private String status;


  @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
  
  @JoinColumn(name = "timesheetid", referencedColumnName = "timesheetid")
 
  @JsonIgnoreProperties("employee") private Timesheet timesheet;
 

  public Timesheet getTimesheet() { return timesheet; } public void
 setTimesheet(Timesheet timesheet) { this.timesheet = timesheet; }
 
public int getProj_id() {
return proj_id;
}
public void setProj_id(int proj_id) {
this.proj_id = proj_id;
}


public String getProj_name() {
return proj_name;
}
public void setProj_name(String proj_name) {
this.proj_name = proj_name;
}
public String getProj_client_name() {
return proj_client_name;
}
public void setProj_client_name(String proj_client_name) {
this.proj_client_name = proj_client_name;
}
public String getProj_client_brief() {
return proj_client_brief;
}
public void setProj_client_brief(String proj_client_brief) {
this.proj_client_brief = proj_client_brief;
}
public String getProj_client_manager() {
return proj_client_manager;
}
public void setProj_client_manager(String proj_client_manager) {
this.proj_client_manager = proj_client_manager;
}
public String getProj_client_emailid() {
return proj_client_emailid;
}
public void setProj_client_emailid(String proj_client_emailid) {
this.proj_client_emailid = proj_client_emailid;
}
public String getProj_os_id() {
return proj_os_id;
}
public void setProj_os_id(String proj_os_id) {
this.proj_os_id = proj_os_id;
}
public String getProj_db_id() {
return proj_db_id;
}
public void setProj_db_id(String proj_db_id) {
this.proj_db_id = proj_db_id;
}
public String getProj_app_server_id() {
return proj_app_server_id;
}
public void setProj_app_server_id(String proj_app_server_id) {
this.proj_app_server_id = proj_app_server_id;
}
public String getProj_pm_name() {
return proj_pm_name;
}
public void setProj_pm_name(String proj_pm_name) {
this.proj_pm_name = proj_pm_name;
}
public String getProj_pl() {
return proj_pl;
}
public void setProj_pl(String proj_pl) {
this.proj_pl = proj_pl;
}
public String getProj_notes() {
return proj_notes;
}
public void setProj_notes(String proj_notes) {
this.proj_notes = proj_notes;
}
public Date getProj_start_date() {
return proj_start_date;
}
public void setProj_start_date(Date proj_start_date) {
this.proj_start_date = proj_start_date;
}
public Date getProj_end_date() {
return proj_end_date;
}
public void setProj_end_date(Date proj_end_date) {
this.proj_end_date = proj_end_date;
}
public String getStatus() {
return status;
}
public void setStatus(String status) {
this.status = status;
}


@Override
public String toString() {
return "ProjectManager [proj_id=" + proj_id + ", proj_name=" + proj_name + ", proj_client_name="
+ proj_client_name + ", proj_client_brief=" + proj_client_brief + ", proj_client_manager="
+ proj_client_manager + ", proj_client_emailid=" + proj_client_emailid + ", proj_os_id=" + proj_os_id
+ ", proj_db_id=" + proj_db_id + ", proj_app_server_id=" + proj_app_server_id + ", proj_pm_name="
+ proj_pm_name + ", proj_pl=" + proj_pl + ", proj_notes=" + proj_notes + ", proj_start_date="
+ proj_start_date + ", proj_end_date=" + proj_end_date + ", status=" + status + "]";
}
}