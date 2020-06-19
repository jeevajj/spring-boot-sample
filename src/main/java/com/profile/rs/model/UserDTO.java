package com.profile.rs.model;

import java.util.Date;
import java.util.List;

public class UserDTO {
	private int id;
	private String name;
	private String email;
	private Date dateOfBirth;
	private String location;
	private List<ContactDTO> contacts;
	private List<EducationDTO> education;
	private List<WorkExperienceDTO> experience;

	public UserDTO() {
	}

	public UserDTO(int id, String name, String email, Date dateOfBirth, String location) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.dateOfBirth = dateOfBirth;
		this.location = location;
	}

	public int getId() {
		return id;
	}

	public UserDTO setId(int id) {
		this.id = id;
		return this;
	}

	public String getName() {
		return name;
	}

	public UserDTO setName(String name) {
		this.name = name;
		return this;
	}

	public String getEmail() {
		return email;
	}

	public UserDTO setEmail(String email) {
		this.email = email;
		return this;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public UserDTO setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
		return this;
	}

	public String getLocation() {
		return location;
	}

	public UserDTO setLocation(String location) {
		this.location = location;
		return this;
	}

	public List<ContactDTO> getContacts() {
		return contacts;
	}

	public UserDTO setContacts(List<ContactDTO> contacts) {
		this.contacts = contacts;
		return this;
	}

	public List<EducationDTO> getEducation() {
		return education;
	}

	public UserDTO setEducation(List<EducationDTO> education) {
		this.education = education;
		return this;
	}

	public List<WorkExperienceDTO> getExperience() {
		return experience;
	}

	public void setExperience(List<WorkExperienceDTO> experience) {
		this.experience = experience;
	}

}
