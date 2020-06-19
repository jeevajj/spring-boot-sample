package com.profile.model;

import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User {
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "name", nullable = false)
	private String name;
	
	@Column(name = "email", nullable = false)
	private String email;
	
	@Column(name = "date_of_birth", nullable = false)
	private Date dateOfBirth;
	
	@Column(name = "location", nullable = false)
	private String location;
    
	@OneToMany(mappedBy = "user")
	private Set<Contact> contacts;
    
	@OneToMany(mappedBy = "user")
	private Set<Education> education;
    
	@OneToMany(mappedBy = "user")
	private Set<WorkExperience> experience;

	public User() {
	}

	public User(int id, String name, String email, Date dateOfBirth, String location) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.dateOfBirth = dateOfBirth;
		this.location = location;
	}
    
	public User(String name, String email, Date dateOfBirth, String location) {
		this.name = name;
		this.email = email;
		this.dateOfBirth = dateOfBirth;
		this.location = location;
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Set<Contact> getContacts() {
		return contacts;
	}

	public void setContacts(Set<Contact> contacts) {
		this.contacts = contacts;
	}

	public Set<Education> getEducation() {
		return education;
	}

	public void setEducation(Set<Education> education) {
		this.education = education;
	}

	public Set<WorkExperience> getExperience() {
		return experience;
	}

	public void setExperience(Set<WorkExperience> experience) {
		this.experience = experience;
	}

}
