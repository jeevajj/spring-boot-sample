package com.profile.rs.model;

import java.util.Date;

public class EducationDTO {

	private String institutionName;

	private String degree;

	private int percentage;

	private Date startYear;

	private Date endYear;

	private String location;

	public EducationDTO() {
	}

	public EducationDTO(String institutionName, String degree, int percentage, Date startYear, Date endYear,
			String location) {
		this.institutionName = institutionName;
		this.degree = degree;
		this.percentage = percentage;
		this.startYear = startYear;
		this.endYear = endYear;
		this.location = location;
	}

	public String getInstitutionName() {
		return institutionName;
	}

	public EducationDTO setInstitutionName(String institutionName) {
		this.institutionName = institutionName;
		return this;
	}

	public String getDegree() {
		return degree;
	}

	public EducationDTO setDegree(String degree) {
		this.degree = degree;
		return this;
	}

	public int getPercentage() {
		return percentage;
	}

	public EducationDTO setPercentage(int percentage) {
		this.percentage = percentage;
		return this;
	}

	public Date getStartYear() {
		return startYear;
	}

	public EducationDTO setStartYear(Date startYear) {
		this.startYear = startYear;
		return this;
	}

	public Date getEndYear() {
		return endYear;
	}

	public EducationDTO setEndYear(Date endYear) {
		this.endYear = endYear;
		return this;
	}

	public String getLocation() {
		return location;
	}

	public EducationDTO setLocation(String location) {
		this.location = location;
		return this;
	}

}
