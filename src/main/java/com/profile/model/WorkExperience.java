package com.profile.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "work_experience")
public class WorkExperience {
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "company_name", nullable = false)
	private String companyName;
	
	@Column(name = "location", nullable = false)
	private String location;
	
	@Column(name = "designation", nullable = false)
	private String designation;
	
	@Column(name = "start_date", nullable = false)
	private Date startDate;
	
	@Column(name = "end_ate", nullable = false)
	private Date endDate;
    
	@ManyToOne
	@JoinColumn(name = "user_id", insertable = false, updatable = false)
	private User user;
	
	@Column(name = "user_id", nullable = false)
	private int userId;
	
	public WorkExperience() {
	}

	public WorkExperience(String companyName, String location, String designation, Date startDate, Date endDate, int userId) {
		this.companyName = companyName;
		this.location = location;
		this.designation = designation;
		this.startDate = startDate;
		this.endDate = endDate;
		this.userId = userId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

}
