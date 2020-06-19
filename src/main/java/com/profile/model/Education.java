package com.profile.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "education")
public class Education {
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "institution_name", nullable = false)
	private String institutionName;
	
	@Column(name = "degree", nullable = false)
	private String degree;
	
	@Column(name = "percentage", nullable = false)
	private int percentage;
	
	@Column(name = "start_year", nullable = false)
	private Date startYear;
	
	@Column(name = "end_year", nullable = false)
	private Date endYear;
	
	@Column(name = "location", nullable = false)
	private String location;
	
    @ManyToOne
	@JoinColumn(name = "user_id", insertable = false, updatable = false)
	private User user;
	
	@Column(name = "user_id", nullable = false)
	private int userId;

	public Education() {
	}

	public Education(String institutionName, String degree, int percentage, Date startYear, Date endYear, String location, int userId) {
		this.institutionName = institutionName;
		this.degree = degree;
		this.percentage = percentage;
		this.startYear = startYear;
		this.endYear = endYear;
		this.location = location;
		this.userId = userId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getInstitutionName() {
		return institutionName;
	}

	public void setInstitutionName(String institutionName) {
		this.institutionName = institutionName;
	}

	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	public int getPercentage() {
		return percentage;
	}

	public void setPercentage(int percentage) {
		this.percentage = percentage;
	}

	public Date getStartYear() {
		return startYear;
	}

	public void setStartYear(Date startYear) {
		this.startYear = startYear;
	}

	public Date getEndYear() {
		return endYear;
	}

	public void setEndYear(Date endYear) {
		this.endYear = endYear;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

}
