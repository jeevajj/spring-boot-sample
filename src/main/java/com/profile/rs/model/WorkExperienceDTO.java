package com.profile.rs.model;

import java.sql.Date;

public class WorkExperienceDTO {

	private String companyName;

	private String location;

	private String designation;

	private Date startDate;

	private Date endDate;

	public WorkExperienceDTO() {
	}

	public WorkExperienceDTO(String companyName, String location, String designation, Date startDate, Date endDate) {
		this.companyName = companyName;
		this.location = location;
		this.designation = designation;
		this.startDate = startDate;
		this.endDate = endDate;
	}

	public String getCompanyName() {
		return companyName;
	}

	public WorkExperienceDTO setCompanyName(String companyName) {
		this.companyName = companyName;
		return this;
	}

	public String getLocation() {
		return location;
	}

	public WorkExperienceDTO setLocation(String location) {
		this.location = location;
		return this;
	}

	public String getDesignation() {
		return designation;
	}

	public WorkExperienceDTO setDesignation(String designation) {
		this.designation = designation;
		return this;
	}

	public Date getStartDate() {
		return startDate;
	}

	public WorkExperienceDTO setStartDate(Date startDate) {
		this.startDate = startDate;
		return this;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

}
